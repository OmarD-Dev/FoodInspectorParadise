package org.example;

public class Meat extends Topping{

    public Meat(String name, int extra) {
        super(name, extra);
    }

    @Override
    public String toString() {
        return super.getName();
    }
}
