package com.qxh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})

public class Springboot06SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot06SecurityApplication.class, args);
    }

}
