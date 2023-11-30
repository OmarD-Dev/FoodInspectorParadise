package org.example;

public class Sandwich implements EdibleItem{

    //make size an enum
    private int size;
    private Double cost;
    private boolean toasted;
    private BreadType breadType;
    //static constants
    private final int SMALL = 4;
    private final int MEDIUM = 8;
    private final int LARGE = 12;



    private CheapToppings cheapToppings;
    private PremiumToppings premiumToppings;

    public Sandwich() {
        this.cheapToppings = new CheapToppings();
        this.premiumToppings = new PremiumToppings();
    }

    public Sandwich(int size, BreadType breadType, boolean toasted) {
        this.size = size;
        this.breadType = breadType;
        this.toasted = toasted;
        this.cheapToppings = new CheapToppings();
        this.premiumToppings = new PremiumToppings();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public void setBreadType(BreadType breadType) {
        this.breadType = breadType;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public void addCheapTopping(String topping) {
        this.cheapToppings.addRegTopping(topping);
    }

    public void addMeat(String meat) {
        this.premiumToppings.addMeat(meat);
    }

    public void addCheese(String cheese) {
        this.premiumToppings.addCheese(cheese);
    }

    public Double sandwichCost() {
        cost = breadType.getBreadCost();
        switch (size) {
            case SMALL:
                cost += 0;
                break;
            case MEDIUM:
                cost += 1.50;
                break;
            case LARGE:
                cost += 3.00;
            default:
                System.out.println("");
        }
        Double premiumToppingsCost = premiumToppings.getMeatPrice(size, 0) +
                premiumToppings.getCheesePrice(size, 0);
        cost += premiumToppingsCost;
        return cost;
    }

    public void displayRegToppings() {
        cheapToppings.displayRegToppings();
        cheapToppings.displaySauces();
        cheapToppings.displaySides();
    }

    public void displayPremiumToppings() {
        premiumToppings.displayMeat();
        premiumToppings.displayCheese();
    }

    @Override
    public double getCost() {
        return 0;
    }
}
