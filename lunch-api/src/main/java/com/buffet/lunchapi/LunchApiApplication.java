package com.buffet.lunchapi;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

@SpringBootApplication
// 아래 annotaion 기능
// @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
// @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
// @Configuration: allow to register extra beans in the context or import additional configuration classes
public class LunchApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LunchApiApplication.class, args);
    }

    @Bean
    public TokenStore JdbcTokenStore(DataSource dataSource) {
        return new JdbcTokenStore(dataSource);
    }
}
