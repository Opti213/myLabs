package ru.mirea.gobachev.labs.lab_04.taskPack;

public class SomeClass implements Nameable {
    private String name;

    SomeClass(){
        name = "noname";
    }

    SomeClass(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
