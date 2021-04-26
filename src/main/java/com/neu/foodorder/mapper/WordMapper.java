package com.neu.foodorder.mapper;

import com.neu.foodorder.entity.User;
import com.neu.foodorder.entity.Word;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface WordMapper {
    //查找所有word
    @Select("select * from word")
    public List<Word> getAll();
    //新增留言
    public int  add(Word word);
}
