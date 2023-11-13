package Metro;

public class Product {
    private String ID;
    private double price;
    private int stockQuantity;
    private String taxation;

    public Product() {
    }

    public Product(String ID, int price, int stockQuantity, String taxation) {
        this.ID = ID;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.taxation = taxation;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getTaxation() {
        return taxation;
    }

    public void setTaxation(String taxation) {
        this.taxation = taxation;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID='" + ID + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", taxation='" + taxation + '\'' +
                '}';
    }
}
