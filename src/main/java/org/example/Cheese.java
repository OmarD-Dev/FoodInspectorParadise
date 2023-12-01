package org.example;

public class Cheese extends Topping{
    public Cheese(String name, int extra) {
        super(name, extra);
    }
    @Override
    public String toString() {
        return super.getName();
    }
}

