package com.neu.foodorder.service;

import com.neu.foodorder.entity.Mood;

import java.util.List;

public interface MoodService {
    public int add(Mood mood);
    public List<Mood> selectMoodById(String userid);
}
