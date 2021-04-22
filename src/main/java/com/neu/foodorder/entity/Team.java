package com.neu.foodorder.entity;

public class Team {

    private  Integer teamid;
    private  String teamname;

    public Team(Integer teamid, String teamname) {
        this.teamid = teamid;
        this.teamname = teamname;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamid=" + teamid +
                ", teamname='" + teamname + '\'' +
                '}';
    }

    public Team() {
        super();
    }
}
