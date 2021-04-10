package com.luna.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Package: com.luna.message
 * @ClassName: MessageApplication
 * @Author: luna
 * @CreateTime: 2020/7/16 16:54
 * @Description:
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class RedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class);
    }

}
