package com.neu.foodorder.controller;


import com.neu.foodorder.entity.Gugu;
import com.neu.foodorder.entity.Mood;
import com.neu.foodorder.entity.User;
import com.neu.foodorder.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/mood")
public class MoodController {
    @Autowired
    private MoodService moodService;
    //注册
    @RequestMapping("/add")
    public Object register(@RequestBody Mood mood, HttpSession session) {
        Map<String,Object> map = new HashMap<String,Object>();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String day=formatter.format(date);
        mood.setTime(day);
        User user=(User)session.getAttribute("loginUser");
        int userid=user.getUserid();
        mood.setUserid(userid);
        int i = moodService.add(mood);
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
            map.put("failMsg", "已存在");
        }
        map.put("result", result);
        return map;
    }

    //获取当前用户的心情
    @RequestMapping("/getmoodbyid")
    public Object getMoodById(HttpSession session) {
        User user=(User)session.getAttribute("loginUser");
       String userid=user.getUserid().toString();
        List<Mood> list=moodService.selectMoodById(userid);
        Map<String,Object> map=new HashMap<>();
        map.put("success", true);
        map.put("code", 1);
        map.put("failMsg", "");
        map.put("result", list);
        if(list==null||list.size()==0) {
            map.put("success", false);
            map.put("code", 0);
            map.put("failMsg", "没有查询到相关内容");
            map.put("result","");
        }
        return map;

    }

}
