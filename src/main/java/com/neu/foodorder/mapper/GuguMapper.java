package com.neu.foodorder.mapper;

import com.neu.foodorder.entity.Gugu;

import com.neu.foodorder.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface GuguMapper {
//    //查找所有用户
//    @Select("select * from gugu")
//    public List<Gugu> getAll();

Gugu selectGuguById(String guguid);

    //新增咕咕
    public int add(Gugu gugu);
    //修改咕咕
    public int updateGugu(Gugu gugu);

//    //喂咕咕
//    public int feed(Gugu gugu);


}
