package com.neu.foodorder.controller;


import com.neu.foodorder.entity.Team;

import com.neu.foodorder.service.TeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    private TeamService teamService;
    //add
    @RequestMapping("/add")
    public Object register(@RequestBody Team team) {
        Map<String,Object> map = new HashMap<String,Object>();


        int i = teamService.add(team);
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
            map.put("failMsg", "team名已存在");
        }
        map.put("result", result);
        return map;
    }

    //getgugu
    @RequestMapping("getteambyid")
    public Object getTodoById(@RequestParam("teamid")String id) {
        Team team= (Team) teamService.selectTeamById(id);
        Map<String,Object> map=new HashMap<>();
        if(team==null) {
            map.put("result","");
            map.put("success",false);
            map.put("code",0);
            map.put("failMsg","没有team");
        }else {
            map.put("result",team);
            map.put("code",1);
            map.put("success",true);
            map.put("failMsg","");
        }
        return map;
    }
    //修改用todo信息
    @RequestMapping("/updateteam")
    public Object updateTodo(@RequestBody Team team) {
        Map<String,Object> map=new HashMap<>();
        int i=teamService.updateTeam(team);
        Map<String,Object> result=new HashMap<>();
        if(i==1) {
            result.put("udMsg", "修改成功");
            map.put("success",true);
            map.put("code",1);
            map.put("failMsg","");
            result.put("teamname修改结果",team.getTeamname());



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
