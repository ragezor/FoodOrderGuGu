package com.neu.foodorder.controller;


import com.neu.foodorder.entity.Gugu;
import com.neu.foodorder.entity.Todo;
import com.neu.foodorder.service.GuguService;
import com.neu.foodorder.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    private TodoService todoService;
    //add
    @RequestMapping("/add")
    public Object register(@RequestBody Todo todo) {
        Map<String,Object> map = new HashMap<String,Object>();


        int i = todoService.add(todo);
        Map<String,Object> result=new HashMap<>();
        if(i==1 ) {
            result.put("regist","添加成功！");
            map.put("sucess", true);
            map.put("code", 1);
            map.put("failMsg", "");

        }
        else {
            result.put("regist","添加失败");
            map.put("sucess", false);
            map.put("code", 0);
            map.put("failMsg", "todo名已存在");
        }
        map.put("result", result);
        return map;
    }

    //getgugu
    @RequestMapping("gettodobyid")
    public Object getTodoById(@RequestParam("todoid")String id) {
       Todo todo= (Todo) todoService.selectTodoById(id);
        Map<String,Object> map=new HashMap<>();
        if(todo==null) {
            map.put("result","");
            map.put("success",false);
            map.put("code",0);
            map.put("failMsg","没有todo");
        }else {
            map.put("result",todo);
            map.put("code",1);
            map.put("success",true);
            map.put("failMsg","");
        }
        return map;
    }
    //修改用todo信息
    @RequestMapping("/updatetodo")
    public Object updateTodo(@RequestBody Todo todo) {
        Map<String,Object> map=new HashMap<>();
        int i=todoService.updateTodo(todo);
        Map<String,Object> result=new HashMap<>();
        if(i==1) {
            result.put("udMsg", "修改成功");
            map.put("success",true);
            map.put("code",1);
            map.put("failMsg","");
            result.put("todoname修改结果",todo.getTodoname());
            result.put("userid修改结果",todo.getUserid());
           result.put("donetime修改结果",todo.getDonetime());


        }
        else {
            result.put("udMsg", "修改失败");
            map.put("success",false);
            map.put("code",0);
            map.put("failMsg","todo不存在或参数为空");
        }
        map.put("result", result);
        return map;
    }

}
