package com.hxf.service;

import com.hxf.bean.Goods;
import com.hxf.dao.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsService implements GoodsMapper {
@Autowired
 private  GoodsMapper goodsMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Goods record) {
        return 0;
    }

    @Override
    public Goods selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public List<Goods> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return 0;
    }
}
