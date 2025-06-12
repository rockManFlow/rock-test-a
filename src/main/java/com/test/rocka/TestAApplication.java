package com.test.rocka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.test.rocka"})
@Slf4j
public class TestAApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestAApplication.class, args);
        log.info("TestAApplication run");
    }
}
