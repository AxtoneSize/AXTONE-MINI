package com.size.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @Description:
 * @Author: CTZ
 * @Date: 2023/11/17
 */
@SpringBootApplication(scanBasePackages = {"com.size.admin"})
public class AxtoneWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AxtoneWebApplication.class);
    }
}
