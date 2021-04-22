package com.neu.foodorder.mapper;

import com.neu.foodorder.entity.Team;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeamMapper {
 Team selectTeamById(String teamid);

//新增队伍
public int add(Team team);
//修改队伍
public int updateTeam(Team team);


}
