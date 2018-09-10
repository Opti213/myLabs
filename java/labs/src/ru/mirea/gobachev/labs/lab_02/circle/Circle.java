package ru.mirea.gobachev.labs.lab_02.circle;

public class Circle {
    private double r;

    Circle(){
        r=1;
    }

    Circle(int r){
        this.r=r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
    
    public double getArea(){
        return 2 * 3.14 * r;
    }
}
