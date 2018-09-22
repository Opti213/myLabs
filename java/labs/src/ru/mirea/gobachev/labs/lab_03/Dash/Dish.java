package ru.mirea.gobachev.labs.lab_03.Dash;

import ru.mirea.gobachev.labs.lab_03.Dash.Dash;

public class Dish extends Dash {
    protected double volume;

    Dish(){
        super();
        volume = 0;
    }

    Dish(double cost, double volume){
        super(cost);
        this.volume = volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void info() {
        System.out.println("cost: " + cost + "\n" + "volume: " + volume);
    }
}
