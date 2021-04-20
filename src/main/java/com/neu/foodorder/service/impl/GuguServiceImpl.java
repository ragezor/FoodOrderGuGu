package com.neu.foodorder.service.impl;

import com.neu.foodorder.entity.Gugu;
import com.neu.foodorder.mapper.GuguMapper;
import com.neu.foodorder.service.GuguService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuguServiceImpl  implements GuguService {
     @Autowired(required = false)
     private  GuguMapper guguMapper;


    @Override
    public int add(Gugu gugu) {
        return guguMapper.add(gugu);
    }

    @Override
    public Gugu selectGuguById(String guguid) {
        return guguMapper.selectGuguById(guguid);
    }

    @Override
    public int updateGugu(Gugu gugu) {
        System.out.println("开始修改咕咕");
        return guguMapper.updateGugu(gugu);
    }
}
