package com.zipcodewilmington.froilansfarm;

public class Person<T extends Edible> implements Eater<T>{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat(T edible) {

    }
}
