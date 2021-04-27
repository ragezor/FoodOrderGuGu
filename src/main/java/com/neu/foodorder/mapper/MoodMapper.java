package com.neu.foodorder.mapper;

import com.neu.foodorder.entity.Mood;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MoodMapper {

    public  int add(Mood mood);
    public List<Mood> selectMoodById(String userid);
}
