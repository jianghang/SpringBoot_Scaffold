package com.github.service.impl;

import com.github.entity.Author;
import com.github.service.ISimpleService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by jianghang on 2018/4/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SimpleServiceImplTest {

    @Autowired
    private ISimpleService simpleService;

    @Test
    public void testSearchAuthor() throws Exception {
        Author author = simpleService.searchAuthor(1);
        Assert.assertEquals(author.getId(),Long.valueOf(1));
    }

    @Test
    public void testSearchAllAuthor() throws Exception {
        List<Author> authorList = simpleService.searchAllAuthor(1,1);
        Assert.assertNotNull(authorList);
    }
}