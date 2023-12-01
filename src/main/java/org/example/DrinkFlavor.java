package org.example;

public enum DrinkFlavor {
    COCA_COLA("Coca-Cola"), PEPSI("Pepsi"), FANTA("Fanta"), MTN_DEW("Mountain Dew"), DR_PEPPER("Dr.Pepper");
    private String name;
    DrinkFlavor(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
