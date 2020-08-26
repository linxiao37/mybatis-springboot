package com.alan.mybatisspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@MapperScan("com.alan.mybatisspringboot.mapper")
@SpringBootApplication
public class MybatisSpringbootApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MybatisSpringbootApplication.class, args);
        applicationContext.getBean("");
    }

}
