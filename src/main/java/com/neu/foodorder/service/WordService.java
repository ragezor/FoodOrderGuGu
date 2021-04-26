package com.neu.foodorder.service;

import com.neu.foodorder.entity.Word;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WordService {

    public List<Word> getAll();
    //新增留言
    public int  add(Word word);
}
