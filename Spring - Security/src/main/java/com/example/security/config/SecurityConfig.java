package com.example.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final String HOME_PAGE = "/";
    private static final String DASHBOARD_PAGE = "/dashboard";
    private static final String SIGN_IN_PAGE = "/sign-in";
    private static final String SIGN_IN_API = "/api/sign-in";
    private static final String SIGN_OUT_API = "/api/sign-out";

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/css/**", "/bootstrap/**", "/assets/bootstrap-solid.svg",
                        HOME_PAGE,
                        SIGN_IN_PAGE,
                        SIGN_IN_API).permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage(SIGN_IN_PAGE)
                .loginProcessingUrl(SIGN_IN_API)
                .defaultSuccessUrl(DASHBOARD_PAGE, true)
//                .failureUrl(SIGN_IN_PAGE + "?error")
                .failureUrl(SIGN_IN_PAGE + "?error") //jesli podamy zly login/haslo to pojawimy sie na stronie logowania
                .and()
                .logout()
                .logoutUrl("api/sign-out")
                .logoutSuccessUrl(HOME_PAGE)
                .deleteCookies("JESSONID");
//                .and()
//                .logout()
//                .logoutUrl(SIGN_OUT_API)
//                .invalidateHttpSession(true) //domyslnie włączone
//                .deleteCookies("JSESSIONID")
//                .logoutSuccessUrl(HOME_PAGE);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("{bcrypt}$2a$12$NID.YIxlFe/Au92P0zbaquwb1/.GR8vkd2mKgZDaj4Np3IQ54JNAO")
                .roles("ADMIN");
    }
}
