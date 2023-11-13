package ShoppingSystem;

import java.util.Arrays;

public class ShoppingCart {
    private String address;
    private String shippingDate;
    private Order order;
    private String items;

    public ShoppingCart() {
    }

    public ShoppingCart(String address, String shippingDate,String items, Order order) {
        this.address = address;
        this.shippingDate = shippingDate;
        this.items=  items;
        this.order = order;
    }

    public String getAddress() {
        return address;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    Product[] product=new Product[4];
    public void addItem(Order order){
        for (int i = 0; i < product.length; i++) {
            i++;
        }
        System.out.println(order);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "address='" + address + '\'' +
                ", shippingDate='" + shippingDate + '\'' +
                ", order=" + order +
                ", items='" + items + '\'' +
                ", product=" + Arrays.toString(product) +
                '}';
    }
}