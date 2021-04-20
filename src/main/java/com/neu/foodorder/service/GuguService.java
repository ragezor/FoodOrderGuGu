package com.neu.foodorder.service;


import com.neu.foodorder.entity.Gugu;

import java.util.List;

public interface GuguService {
    public int add(Gugu gugu);//申请鸽子
    Gugu selectGuguById(String guguid);
    public int updateGugu(Gugu gugu);
}
