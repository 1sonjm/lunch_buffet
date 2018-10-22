package com.buffet.lunchapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
// JPA Auditing 활성화
@SpringBootApplication
// 아래 annotaion 기능
// @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
// @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)
// @Configuration: allow to register extra beans in the context or import additional configuration classes
public class LunchApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LunchApiApplication.class, args);
    }
}
