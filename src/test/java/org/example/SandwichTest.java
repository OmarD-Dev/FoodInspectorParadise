package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {

    @org.junit.jupiter.api.Test
    void getPriceTest() {

        Sandwich s = new Sandwich();
        s.addMeat("STEAK");
        s.addMeat("STEAK");
        double price = s.getPrice();
        Assertions.assertEquals(9.5, s.getPrice());
    }
}