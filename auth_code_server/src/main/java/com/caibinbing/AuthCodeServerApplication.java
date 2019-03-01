package com.caibinbing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication
public class AuthCodeServerApplication {
    private static final Logger logger = LogManager.getLogger(AuthCodeServerApplication.class);

    public static void main(String[] args) {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        String encodedPassword = encoder.encode("EEKA@2019");
        logger.info(encodedPassword);
        SpringApplication.run(AuthCodeServerApplication.class, args);
    }

}
