package org.example;

public class Topping {
    private String name;
    private int extra;

    public Topping(String name, int extra) {
        this.name = name;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }
}
