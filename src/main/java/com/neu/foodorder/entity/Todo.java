package com.neu.foodorder.entity;

public class Todo {
    private  int todoid;
    private  int userid;
    private  String todoname;
    private  String donetime;

    public Todo(int todoid, int userid, String todoname, String donetime) {
        this.todoid = todoid;
        this.userid = userid;
        this.todoname = todoname;
        this.donetime = donetime;
    }

    public int getTodoid() {
        return todoid;
    }

    public void setTodoid(int todoid) {
        this.todoid = todoid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getTodoname() {
        return todoname;
    }

    public void setTodoname(String todoname) {
        this.todoname = todoname;
    }

    public String getDonetime() {
        return donetime;
    }

    public void setDonetime(String donetime) {
        this.donetime = donetime;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoid=" + todoid +
                ", userid=" + userid +
                ", todoname='" + todoname + '\'' +
                ", donetime='" + donetime + '\'' +
                '}';
    }

    public Todo() {
        super();
    }
}
