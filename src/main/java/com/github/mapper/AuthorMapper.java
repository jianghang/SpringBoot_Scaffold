package com.github.mapper;

import com.github.entity.Author;

import java.util.List;

public interface AuthorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Author record);

    int insertSelective(Author record);

    Author selectByPrimaryKey(Long id);

    List<Author> selectAllAuthor();

    int updateByPrimaryKeySelective(Author record);

    int updateByPrimaryKey(Author record);
}