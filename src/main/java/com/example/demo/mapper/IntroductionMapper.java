package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Introduction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IntroductionMapper extends BaseMapper<Introduction> {
    //    @Select("select * from introduction where book_id=#{id}")
//    public List<Introduction> getIntroductionByBookId(int id);
    @Select("select introduction from introduction where book_id=#{id}")
    public String getIntroductionByBookId(int id);
}
