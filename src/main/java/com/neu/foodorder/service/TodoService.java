package com.neu.foodorder.service;

import com.neu.foodorder.entity.Gugu;
import com.neu.foodorder.entity.Todo;

import java.util.List;

public interface TodoService {
    public int add(Todo todo);//申请todo
    Todo selectTodoById(String todoid);
    public int updateTodo(Todo todo);
    //获得todo
    public List<Todo> getTodoById(int userid);
}
