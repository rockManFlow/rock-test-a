package com.test.rocka.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("test/a")
@RestController
public class TestAController {
    @RequestMapping(value = "create",method = RequestMethod.GET)
    public String create(String name,Integer age){
        log.info("TestAController create");

        log.info("TestAController create request:{}");
        log.info("TestAController create response:{}");
        return "ok";
    }
}
