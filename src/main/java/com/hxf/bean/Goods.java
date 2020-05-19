package com.hxf.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Goods {
    private Integer id;

    private String name;

    private Long price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date gtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Date getGtime() {
        return gtime;
    }

    public void setGtime(Date gtime) {
        this.gtime = gtime;
    }
}