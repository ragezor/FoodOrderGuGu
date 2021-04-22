package com.neu.foodorder.service.impl;

import com.neu.foodorder.entity.Todo;
import com.neu.foodorder.mapper.GuguMapper;
import com.neu.foodorder.mapper.TodoMapper;
import com.neu.foodorder.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired(required = false)
    private TodoMapper todoMapper;
    @Override
    public int add(Todo todo) {
        System.out.println(todo.getTodoname());
        return todoMapper.add(todo);
    }

    @Override
    public Todo selectTodoById(String todoid) {
        return todoMapper.selectTodoById(todoid);
    }

    @Override
    public int updateTodo(Todo todo) {
        return todoMapper.updateTodo(todo);
    }
}
