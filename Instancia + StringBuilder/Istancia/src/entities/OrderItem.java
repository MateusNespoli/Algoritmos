package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;

    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal(){
        double result = quantity;
        result *= price;
        return result;
    }

    @Override
    public String toString() {
        return "" + product.getName() + ", $" + price + ", quantity: " + quantity + ", Subtotal: " + subTotal();
    }
    
}
