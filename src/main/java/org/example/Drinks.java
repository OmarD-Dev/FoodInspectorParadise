package org.example;

import java.util.ArrayList;

public class Drinks implements EdibleItem{
    private ArrayList<String> drinkType;

    public Drinks() {
        this.drinkType = new ArrayList<>();
        initializeDrinks();
    }

    private void initializeDrinks() {
        drinkType.add("Coca Cola");
        drinkType.add("Pepsi");
        drinkType.add("Fanta");
        drinkType.add("Sprite");
        drinkType.add("Mountain Dew");
        drinkType.add("Dr. Pepper");
    }

    /*
    NOTE: how will add flavor relate to the order screen?
                might need to come back to this method
     */
//    public void addDrink(String flavor, DrinkSize size) {
  //      this.drinkType.add(flavor);
 //   }

    public String getDrink(int index) {
        if (index >= 0 && index < drinkType.size()) {
            return drinkType.get(index);
        } else {
            return null;
        }
    }

    @Override
    public double getCost() {
        return 2.50;
    }
}
