//TODO: add bread types and fill out totalCost method

package org.example;
import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    //make size an enum
    private int size;
    private Double cost;
    private boolean toasted;
    private BreadType breadType;
    //static constants
    private final int SMALL = 4;
    private final int MEDIUM = 8;
    private final int LARGE = 12;
    //change cheapToppings
    private List<String> cheapToppings;
    private PremiumToppings premiumToppings;


    public Sandwich() {
    this.cheapToppings = new ArrayList<>();
    this.premiumToppings = new PremiumToppings();
    }

    public Sandwich(int size, BreadType breadType, boolean toasted){
        this.size = size;
        this.breadType = breadType;
        this.toasted = toasted;
        this.cheapToppings = new ArrayList<>();
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
        this.cheapToppings.add(topping);
    }

    public void addMeat(String meat){
        this.premiumToppings.addMeat(meat);
    }

    public void addCheese(String cheese){
        this.premiumToppings.addCheese(cheese);
    }

  public Double totalCost(){
        cost = breadType.getCost();
        switch (size){
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
        System.out.println("Regular Toppings: \n");
        for (String toppings :  cheapToppings) {
            System.out.println("- " +  toppings);
        }
    }

    public void displayPremiumToppings(){
        premiumToppings.displayMeat();
        premiumToppings.displayCheese();
    }

}
