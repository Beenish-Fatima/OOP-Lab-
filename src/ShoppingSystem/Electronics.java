package ShoppingSystem;

import java.util.ArrayList;
import java.util.Objects;

public class Electronics extends Product{

    private String brand;
    private int warrantyPeriod;

    public Electronics(int productId, String name, double price, String brand, int warrantyPeriod) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Electronics that = (Electronics) o;
        return warrantyPeriod == that.warrantyPeriod && Objects.equals(brand, that.brand);
    }

//    public void displayDetails(){
//        System.out.println("Electronics Details");
//        System.out.println("ID" +getProductId());
//        System.out.println("Name " +getName());
//        System.out.println("Price " +getPrice());
//        System.out.println("Brand name:" +getBrand());
//        System.out.println("Warranty: " +getWarrantyPeriod());
//
//    }





    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", warrantyPeriod=" + warrantyPeriod +
                '}';
    }
}
