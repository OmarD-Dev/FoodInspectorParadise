package org.example.Receipts;
import org.example.Order;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipt {
    public static void generateReceipt(Order order) {
        String timestamp= generateTimestamp();
        String filename= timestamp +".txt";
        try(BufferedWriter writer= new BufferedWriter(new FileWriter(filename))){
            writer.write("Order Details:\n");
        /* loop through order and write out each item to list with price
        another write statement to show total price at bottom
        */
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static String generateTimestamp(){
        LocalDateTime orderTime= LocalDateTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        return orderTime.format(formatter);
    }
}
