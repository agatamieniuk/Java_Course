package com.example.security.service;

import com.example.security.dto.UserDto;
import com.example.security.entity.Role;
import com.example.security.entity.User;
import com.example.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    public UserService(@Autowired UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //nadpisana metoda ktora pozniej zczyta bazę danych
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User: " + username + " does not exist"));
        return map(user);
    }

    public List<UserDto> getUsers() {
        return userRepository.findAll().stream().map(this::map).map(this::toDto).collect(Collectors.toList());
    }

    private SecureUser map(User user) {
        SecureUser secure = new SecureUser();
        secure.setId(user.getId());
        secure.setUsername(user.getUsername());
        secure.setPassword(user.getPassword());
        secure.setRoles(user.getRoles().stream().map(Role::getName).collect(Collectors.toList()));
        return secure;
    }

    private UserDto toDto(SecureUser user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setRoles(user.getRoles());
        return dto;
    }
}
