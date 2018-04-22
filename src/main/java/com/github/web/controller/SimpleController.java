package com.github.web.controller;

import com.github.entity.Author;
import com.github.service.ISimpleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jianghang on 2018/4/18.
 */
@RestController
public class SimpleController {

    private static Logger logger = LoggerFactory.getLogger(SimpleController.class);

    @Autowired
    private ISimpleService simpleService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(@RequestParam(required = false) String str){
        logger.info("hello: {}",str);

        return "hello," + str;
    }

    @RequestMapping(value = "/searchAuthorById",method = RequestMethod.GET)
    public Author searchAuthorById(@RequestParam Integer id){
        logger.info("id: {}",id);
        Author author = simpleService.searchAuthor(id);

        return author;
    }

    @RequestMapping(value = "/searchAllAuthor/{pageNum}/{pageSize}",method = RequestMethod.GET)
    public List<Author> searchAllAuthor(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize){
        return simpleService.searchAllAuthor(pageNum,pageSize);
    }
}
