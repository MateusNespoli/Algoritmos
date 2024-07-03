package application;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        
        Client c1 = new Client("Alex Green","alex@gmail.com",sdf.parse("15/03/1985 00:00:00"));
        String orderStatus = "PROCESSING";
        Date now = new Date();
        String formattedDateTime = sdf.format(now);

        Order o1 = new Order(sdf.parse(formattedDateTime), OrderStatus.valueOf(orderStatus), c1);

        Product p1 = new Product("TV", 1000.0);
        Product p2 = new Product("Mousee", 4000.0);

        OrderItem oI1 = new OrderItem(1, 1000.0);
        OrderItem oI2 = new OrderItem(2, 40.0);
        oI1.setProduct(p1);
        oI2.setProduct(p2);

        o1.addItem(oI1);
        o1.addItem(oI2);

        System.out.println(o1);

    }
}
