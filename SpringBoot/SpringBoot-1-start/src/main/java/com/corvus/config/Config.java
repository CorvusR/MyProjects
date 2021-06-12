package com.corvus.config;

import com.corvus.beans.Pet;
import com.corvus.beans.PropertyTest;
import com.corvus.beans.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableConfigurationProperties(PropertyTest.class)
public class Config {
    @Bean
    public User user1() {
        return new User("张三", 5);
    }

    @Bean
    public Pet pet1() {
        return new Pet("阿福");
    }
}
