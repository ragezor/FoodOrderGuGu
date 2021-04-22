package com.neu.foodorder.service.impl;

import com.neu.foodorder.entity.Team;
import com.neu.foodorder.mapper.TeamMapper;
import com.neu.foodorder.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired(required = false)
    private TeamMapper teamMapper;
    @Override
    public int add(Team team) {
        return teamMapper.add(team) ;
    }

    @Override
    public Team selectTeamById(String teamid) {
        return teamMapper.selectTeamById(teamid);
    }

    @Override
    public int updateTeam(Team team) {
        return teamMapper.updateTeam(team);
    }
}
