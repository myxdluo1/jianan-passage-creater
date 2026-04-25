package com.jianan.jiananpassagercreater;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.jianan.jiananpassagercreater.mapper")
@SpringBootApplication
public class JiananPassagerCreaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiananPassagerCreaterApplication.class, args);
    }

}
