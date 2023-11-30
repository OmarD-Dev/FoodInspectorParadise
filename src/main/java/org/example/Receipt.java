package org.example;
import org.example.EdibleItem;
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
            for(EdibleItem i : order.getOrderItems()){
                writer.write(i.toString()+"- $" + i.getCost() + "\n");
            }
            writer.write("Total: $" + order.calculateTotal());
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
