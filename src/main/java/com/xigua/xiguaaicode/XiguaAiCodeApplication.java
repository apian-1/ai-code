package com.xigua.xiguaaicode;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@MapperScan("com.xigua.xiguaaicode.mapper")
public class XiguaAiCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiguaAiCodeApplication.class, args);
    }

}
