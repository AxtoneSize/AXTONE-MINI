package com.size.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author: CTZ
 * @Date: 2023/11/17
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.size.admin"})
public class AxtoneWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AxtoneWebApplication.class);
        log.info(AxtoneWebApplication.class.getSimpleName() + " Start Successful");
    }
}
