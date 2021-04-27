package com.neu.foodorder.entity;

public class Mood {
    private  Integer moodid;
    private  Integer userid;
    private  Integer moodlevel;
    private  String  time;

    public Mood(Integer moodid, Integer userid, Integer moodlevel, String time) {
        this.moodid = moodid;
        this.userid = userid;
        this.moodlevel = moodlevel;
        this.time = time;
    }

    public Integer getMoodid() {
        return moodid;
    }

    public void setMoodid(Integer moodid) {
        this.moodid = moodid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getMoodlevel() {
        return moodlevel;
    }

    public void setMoodlevel(Integer moodlevel) {
        this.moodlevel = moodlevel;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Mood{" +
                "moodid=" + moodid +
                ", userid=" + userid +
                ", moodlevel=" + moodlevel +
                ", time='" + time + '\'' +
                '}';
    }

    public Mood() {
        super();
    }
}
