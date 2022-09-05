package com.sujin.testprj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TestPrjApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestPrjApplication.class, args);
    }

}
