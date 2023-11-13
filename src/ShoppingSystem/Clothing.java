package ShoppingSystem;

import java.util.Objects;

public class Clothing extends Product{
    public String size;
    public String material;

    public Clothing(int productId, String name, double price, String size, String material) {
        super(productId, name, price);
        this.size = size;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clothing clothing = (Clothing) o;
        return Objects.equals(size, clothing.size) && Objects.equals(material, clothing.material);
    }

//    public void displayDetails(){
//        System.out.println("Clothing Details");
//        System.out.println("ID: " +getProductId());
//        System.out.println("Name: " +getName());
//        System.out.println("Price: " +getPrice());
//        System.out.println("Size: "+getSize());
//        System.out.println("Material: "+ getMaterial());
//    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
