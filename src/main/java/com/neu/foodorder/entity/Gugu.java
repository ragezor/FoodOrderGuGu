package com.neu.foodorder.entity;



public class Gugu {
    private Integer id;

    private Integer weight;

    private String guguname;

    private double state;
    private Integer food;
    private Integer gugulevel;

    @Override
    public String toString() {
        return "Gugu{" +
                "id=" + id +
                ", weight=" + weight +
                ", guguname='" + guguname + '\'' +
                ", state=" + state +
                ", food=" + food +
                ", gugulevel=" + gugulevel +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getGuguname() {
        return guguname;
    }

    public void setGuguname(String guguname) {
        this.guguname = guguname;
    }

    public double getState() {
        return state;
    }

    public void setState(double state) {
        this.state = state;
    }

    public Integer getFood() {
        return food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }

    public Integer getGugulevel() {
        return gugulevel;
    }

    public void setGugulevel(Integer gugulevel) {
        this.gugulevel = gugulevel;
    }

    public Gugu(Integer id, Integer weight, String guguname, double state, Integer food, Integer gugulevel) {
        this.id = id;
        this.weight = weight;
        this.guguname = guguname;
        this.state = state;
        this.food = food;
        this.gugulevel = gugulevel;
    }

    public Gugu() {
        super();
    }
}
