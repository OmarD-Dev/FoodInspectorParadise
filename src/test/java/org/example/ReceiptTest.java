package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ReceiptTest {

    @Test
    public void testOrderReceipt(){
        Order o = new Order();
        o.addOrderItem(new Drink(DrinkFlavor.DR_PEPPER, DrinkSize.MEDIUM));
        o.addOrderItem(new Drink(DrinkFlavor.DR_PEPPER, DrinkSize.MEDIUM));
        Assertions.assertEquals(5.00,o.calculateTotal());
        Receipt.generateReceipt(o);
    }

}