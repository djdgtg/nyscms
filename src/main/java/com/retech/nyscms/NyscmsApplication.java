package com.retech.nyscms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@MapperScan("com.retech.nyscms.mapper")
@EnableJms
public class NyscmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NyscmsApplication.class, args);
    }

}
