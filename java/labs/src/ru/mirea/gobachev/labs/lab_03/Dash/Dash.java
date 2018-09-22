package ru.mirea.gobachev.labs.lab_03.Dash;

public abstract class Dash {
    protected double cost;

    Dash() {cost = 0;}
    Dash(double cost) {this.cost = cost;}

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public abstract void info();

}
