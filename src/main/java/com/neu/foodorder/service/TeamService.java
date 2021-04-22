package com.neu.foodorder.service;

import com.neu.foodorder.entity.Team;

public interface TeamService {
    public int add(Team team);//申请鸽子
    Team selectTeamById(String teamid);
    public int updateTeam(Team team);

}
