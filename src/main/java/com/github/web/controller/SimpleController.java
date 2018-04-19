package com.github.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jianghang on 2018/4/18.
 */
@RestController
public class SimpleController {

    private static Logger logger = LoggerFactory.getLogger(SimpleController.class);

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam(required = false) String str){
        logger.info("hello: {}",str);

        return "hello," + str;
    }
}
