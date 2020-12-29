package com.example.dwtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication(scanBasePackages = "com.example.dwtest")
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class DwTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DwTestApplication.class, args);
    }

}
