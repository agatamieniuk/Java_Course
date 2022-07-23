package com.isa.functional;

import com.isa.functional.containters.Container;
import com.isa.functional.model.Address;
import com.isa.functional.myfunctions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("App");

        List<Address> addressList = new ArrayList<>();
        addressList.add(new Address("pomorskie", "Gdańsk", "Kubusia", 100));
        addressList.add(new Address("pomorskie", "Gdynia", "Puchatka", 20));
        addressList.add(new Address("podlaskie", "Białystok", "Gruntowa", 50));
        addressList.add(new Address("podlaski", "Zabudów", "Górna", 5));

        List<Address> pomorskie = addressList.stream()
                .filter(address -> address.getState().equals("pomorskie"))
                .collect(Collectors.toList());
        logger.info(pomorskie.toString());

        List<Address> miastaNaZ = addressList.stream()
                .filter(address -> address.getCity().startsWith("Z"))
                .collect(Collectors.toList());
        logger.info(miastaNaZ.toString());

        List<String> miasta = addressList.stream()
                .map(address -> address.getCity())
                .collect(Collectors.toList());
        logger.info(miasta.toString());

        List<Boolean> parzysteWojewodztwo = addressList.stream()
                .map(address -> address.getState().length() % 2 == 0)
                .collect(Collectors.toList());
        logger.info(parzysteWojewodztwo.toString());

    }
}