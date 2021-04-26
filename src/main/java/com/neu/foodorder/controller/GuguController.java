package com.neu.foodorder.controller;

import com.neu.foodorder.entity.Gugu;
import com.neu.foodorder.entity.User;
import com.neu.foodorder.service.GuguService;
import com.neu.foodorder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/gugu")
public class GuguController {
    @Autowired
    private GuguService guguService;
    //注册
    @RequestMapping("/add")
    public Object register(@RequestBody Gugu gugu) {
        Map<String,Object> map = new HashMap<String,Object>();


        int i = guguService.add(gugu);
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
            map.put("failMsg", "咕咕名已存在");
        }
        map.put("result", result);
        return map;
    }

    //获取当前用户的咕咕
    @RequestMapping("getgugubyid")
    public Object getGuguById(@RequestParam("guguid")String id) {
       Gugu gugu= (Gugu) guguService.selectGuguById(id);
        Map<String,Object> map=new HashMap<>();
        if(gugu==null) {
            map.put("result","");
            map.put("success",false);
            map.put("code",0);
            map.put("failMsg","没有咕咕");
        }else {
            map.put("result",gugu);
            map.put("code",1);
            map.put("success",true);
            map.put("failMsg","");
        }
        return map;
    }
    //修改用咕咕信息
    @RequestMapping("/updategugu")
    public Object updateGugu(@RequestBody Gugu gugu) {
        Map<String,Object> map=new HashMap<>();
        int i=guguService.updateGugu(gugu);
        Map<String,Object> result=new HashMap<>();
        if(i==1) {
            result.put("udMsg", "修改成功");
            map.put("success",true);
            map.put("code",1);
            map.put("failMsg","");
        }
        else {
            result.put("udMsg", "修改失败");
            map.put("success",false);
            map.put("code",0);
            map.put("failMsg","用户不存在或参数为空");
        }
        map.put("result", result);
        return map;
    }
    //喂养鸽子
    @RequestMapping("/feedgugu")
    public Object feedGugu(@RequestBody Gugu gugu) {
        Map<String,Object> map=new HashMap<>();
        Gugu newgugu=guguService.selectGuguById(gugu.getId().toString());
        int  foodremian=newgugu.getFood();
        if(newgugu.getFood()>=1){
            System.out.println("gugufood:"+newgugu.getFood());
            newgugu.setFood(newgugu.getFood()-1);
            newgugu.setWeight(newgugu.getWeight()+1);
            System.out.println("guguweight:"+newgugu.getWeight());
            if((int)Math.sqrt(newgugu.getWeight())!=newgugu.getGugulevel()){
                newgugu.setGugulevel((int) Math.sqrt(newgugu.getWeight()));
                System.out.println("升级了");
            }
        }
        int i=guguService.updateGugu(newgugu);
        Map<String,Object> result=new HashMap<>();
        if(i==1&&foodremian>=1) {
            result.put("udMsg", "喂养成功");
            map.put("success",true);
            map.put("code",1);
            map.put("failMsg","");
        }
        else {
            result.put("udMsg", "喂养失败");
            map.put("success",false);
            map.put("code",0);
            map.put("failMsg","没鸽粮了");
        }
        map.put("result", result);
        return map;
    }
}
