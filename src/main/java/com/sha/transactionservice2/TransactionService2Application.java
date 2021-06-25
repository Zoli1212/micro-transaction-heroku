package com.sha.transactionservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class TransactionService2Application {

    public static void main(String[] args) {
        SpringApplication.run(TransactionService2Application.class, args);
    }

}
