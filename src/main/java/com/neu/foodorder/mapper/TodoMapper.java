package com.neu.foodorder.mapper;

import com.neu.foodorder.entity.Gugu;
import com.neu.foodorder.entity.Todo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoMapper {
    Todo  selectTodoById(String todoid);

    //新增todo
    public int add(Todo todo);
    //修改todo
    public int updateTodo(Todo todo);
}
