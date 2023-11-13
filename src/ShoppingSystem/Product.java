package ShoppingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {

    private int productId;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Electronics> electronics;
    Electronics= new ArrayList<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Double.compare(price, product.price) == 0 && Objects.equals(name, product.name);
    }

//    public void displayDetails(){
//        System.out.println("Product Details");
//        System.out.println("ID: " +getProductId());
//        System.out.println("Name: " +getName());
//        System.out.println("Price: " +getPrice());
//    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
