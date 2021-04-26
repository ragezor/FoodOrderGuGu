package com.neu.foodorder.service.impl;

import com.neu.foodorder.entity.Word;
import com.neu.foodorder.mapper.UserMapper;
import com.neu.foodorder.mapper.WordMapper;
import com.neu.foodorder.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {
    @Autowired(required = false)
    private WordMapper mapper;

    @Override
    public List<Word> getAll() {
        return mapper.getAll();
    }

    @Override
    public int add(Word word) {
        return mapper.add(word);
    }
}
