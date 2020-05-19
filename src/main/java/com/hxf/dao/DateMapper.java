package com.hxf.dao;

import com.hxf.bean.Date;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Date record);

    Date selectByPrimaryKey(Integer id);

    List<Date> selectAll();

    int updateByPrimaryKey(Date record);

    List<Date> selectId(@Param("username")String username);
}