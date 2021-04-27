package com.neu.foodorder.service.impl;

import com.neu.foodorder.entity.Mood;
import com.neu.foodorder.mapper.GuguMapper;
import com.neu.foodorder.mapper.MoodMapper;
import com.neu.foodorder.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoodServiceImpl implements MoodService {
    @Autowired(required = false)
    private MoodMapper moodMapper;
    @Override
    public int add(Mood mood) {
        return moodMapper.add(mood);
    }

    @Override
    public List<Mood> selectMoodById(String userid) {
        return moodMapper.selectMoodById(userid);
    }
}
