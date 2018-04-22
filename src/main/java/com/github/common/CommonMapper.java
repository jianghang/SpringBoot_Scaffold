package com.github.common;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by jianghang on 2018/4/22.
 */
public interface CommonMapper<T> extends Mapper<T>,MySqlMapper<T>{
}
