package com.corvus.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private String name;
    private int age;
    private List<String> children;
}
