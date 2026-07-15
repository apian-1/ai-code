package com.xigua.xiguaaicode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xigua.xiguaaicode.mapper")
public class XiguaAiCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiguaAiCodeApplication.class, args);
    }

}
