package com.hxf.controller;

import com.hxf.bean.Goods;
import com.hxf.dao.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class GoodsController {
    @Autowired
    private GoodsMapper goodsMapper;
    @RequestMapping("all")
    public String seletAll(HttpServletRequest request, HttpServletResponse response){
        List<Goods> goodsList = goodsMapper.selectAll();
        request.setAttribute("goodsList",goodsList);
        return "goods";
    }

    @RequestMapping("d")
    public String delete(Integer id, HttpServletRequest request,HttpServletResponse response){
        goodsMapper.deleteByPrimaryKey(id);
        return seletAll(request,response);
    }
}
