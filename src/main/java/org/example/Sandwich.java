package org.example;

public class Sandwich implements PriceableItem {

    //make size an enum
    private int size;
    private Double cost;
    private boolean toasted;
    private BreadType breadType;
    //static constants
    private static final int SMALL = 4;
    private static final int MEDIUM = 8;
    private static final int LARGE = 12;

    private int meatCounter = 0;
    private int cheeseCounter = 0;
    private int regToppingCounter=0;
    private int sauceCounter= 0;

    private RegularToppings regularToppings;
    private PremiumToppings premiumToppings;

    public Sandwich() {
       this(MEDIUM, BreadType.WHEAT, false);
    }

    public Sandwich(int size, BreadType breadType, boolean toasted) {
        this.size = size;
        this.breadType = breadType;
        this.toasted = toasted;
        this.regularToppings = new RegularToppings();
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
        this.regularToppings.addRegTopping(topping);
        regToppingCounter++;
    }

    public int getRegToppingCounter() {
        return regToppingCounter;
    }

    public int getMeatCounter() {
        return meatCounter;
    }
    public int getCheeseCounter(){
        return cheeseCounter;
    }

    public int getSauceCounter() {
        return sauceCounter;
    }

    public void addMeat(String meat) {
        this.premiumToppings.addMeat(meat);
        this.meatCounter++;
    }
    public void addSauce(String sauce) {
        this.regularToppings.addSauce(sauce);
        this.sauceCounter++;
    }

    public void addCheese(String cheese) {
        this.premiumToppings.addCheese(cheese);
        this.cheeseCounter++;
    }

    public void displayRegularToppings() {
        regularToppings.displayRegToppings();
        regularToppings.displaySauces();
        regularToppings.displaySides();
    }

    public void displayPremiumToppings() {
        premiumToppings.displayMeat();
        premiumToppings.displayCheese();
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + size +
                ", cost=" + cost +
                ", toasted=" + toasted +
                ", breadType=" + breadType +
                ", regularToppings=" + regularToppings +
                ", premiumToppings=" + premiumToppings +
                '}';
    }

    @Override
    public double getPrice() {
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
                break;
            default:
        }
        Double premiumToppingsCost = premiumToppings.getTotalMeatPrice(size) +
                premiumToppings.getTotalCheesePrice(size);
        cost += premiumToppingsCost;
        return cost;
    }
}
