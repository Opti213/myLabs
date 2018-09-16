package ru.mirea.gobachev.labs.lab_03.Dash;

public class DashTest {
    public static void test() {
        Dish dish = new Dish();
        Pan pan = new Pan(1,1);
        dish.info();
        pan.info();
    }
}
