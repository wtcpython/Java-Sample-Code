package com.wtc.advanceclass.inherit.test;

public class Manager extends Employee {
    private double bonus;

    public Manager() {

    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("管理其他人");
    }

}
