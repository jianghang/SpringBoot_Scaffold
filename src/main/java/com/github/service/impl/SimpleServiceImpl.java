package com.github.service.impl;

import com.github.entity.Author;
import com.github.mapper.AuthorMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.service.ISimpleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jianghang on 2018/4/22.
 */
@Service
public class SimpleServiceImpl implements ISimpleService{

    private static Logger logger = LoggerFactory.getLogger(SimpleServiceImpl.class);

    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public Author searchAuthor(Integer id) {
        Author author = authorMapper.selectByPrimaryKey(id);

        return author;
    }

    @Override
    public List<Author> searchAllAuthor(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize).setOrderBy("id");
        List<Author> authorList = authorMapper.selectAllAuthor();
        Page<Author> authorPage = (Page<Author>) authorList;
        logger.info("Author count: {},order by: {}",authorPage.getTotal(),authorPage.getOrderBy());

        return authorList;
    }
}
