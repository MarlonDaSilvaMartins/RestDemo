package br.com.restdemo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RestDemoApplication {//teste

    public static void main(String[] args) {
        SpringApplication.run(RestDemoApplication.class, args);
    }
}
