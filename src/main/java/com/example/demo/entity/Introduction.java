package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;



@TableName("introduction")
public class Introduction {
//    private int id;

    private Integer id;
    private int bookId;
    private  String introduction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {return bookId;}
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
