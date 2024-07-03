package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

    private Date momment;
    private OrderStatus status;

    Client client;
    List <OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date momment, OrderStatus status, Client client) {
        this.momment = momment;
        this.status = status;
        this.client = client;
    }

    public Date getMomment() {
        return momment;
    }

    public void setMomment(Date momment) {
        this.momment = momment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total(){
        double total = 0;
        for(OrderItem c : items){
            total += c.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\nOrder momment: " + momment);
        sb.append("\n Order status: " + status);
        sb.append("\nClient: " + client.getName() + " " + sdf.format(client.getBirthDate()) + " - " + client.getEmail());
        sb.append("\nORDER ITEMS:");
        for(OrderItem c : items) {
            sb.append("\n" + c.toString());
        }
        sb.append("\nTotal price: " + total());
        return sb.toString();
    }

   
     

    
}
