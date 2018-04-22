package com.github.service;

import com.github.entity.Author;

import java.util.List;

/**
 * Created by jianghang on 2018/4/22.
 */
public interface ISimpleService {

    Author searchAuthor(Integer id);

    List<Author> searchAllAuthor(int pageNum,int pageSize);
}
