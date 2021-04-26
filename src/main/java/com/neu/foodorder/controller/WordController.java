package com.neu.foodorder.controller;

import com.neu.foodorder.entity.Gugu;
import com.neu.foodorder.entity.Word;
import com.neu.foodorder.service.UserService;
import com.neu.foodorder.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/word")
public class WordController {
    @Autowired
    private WordService wordService;
    //注册
    @RequestMapping("/add")
    public Object add(@RequestBody Word word) {
        Map<String,Object> map = new HashMap<String,Object>();


        int i = wordService.add(word);
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
            map.put("failMsg", "留言已存在");
        }
        map.put("result", result);
        return map;
    }
}
