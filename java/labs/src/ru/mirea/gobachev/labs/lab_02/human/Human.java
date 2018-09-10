package ru.mirea.gobachev.labs.lab_02.human;

public class Human {
    String name;
    Head heads;
    Hand hands;
    Leg legs;

    Human(){
        name = "Bob";
        hands = new Hand();
        heads = new Head();
        legs = new Leg();
    }

    Human(String name, int countOfHeads, int countOfHands, int countOfLegs){
        this.name = name;
        hands = new Hand(countOfHands);
        heads = new Head(countOfHeads);
        legs = new Leg(countOfLegs);
    }

    public void getInfo(){
        System.out.println("name: " + name);
        System.out.println("count of heads: " + heads.count);
        System.out.println("count of hands: " + hands.count);
        System.out.println("count of legs: " + legs.count);
    }

}
