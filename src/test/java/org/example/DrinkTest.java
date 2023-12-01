package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrinkTest {

    @Test
    public void  drinkTest(){
        Drink test1 = new Drink(DrinkFlavor.FANTA, DrinkSize.MEDIUM);
        Assertions.assertEquals(DrinkFlavor.FANTA, DrinkFlavor.FANTA.getName());
    }

}
