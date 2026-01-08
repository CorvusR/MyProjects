package com.example.myspringboot;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.example.myspringboot.dao"})
@SpringBootApplication
@Log4j2
public class MyspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspringbootApplication.class, args);
    }

}
