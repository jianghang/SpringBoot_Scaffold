package com.github.mapper;

import com.github.common.CommonMapper;
import com.github.entity.Author;

import java.util.List;

public interface AuthorMapper extends CommonMapper<Author> {

    List<Author> selectAllAuthor();
}