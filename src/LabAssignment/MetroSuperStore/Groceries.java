package LabAssignment.MetroSuperStore;

public class Groceries extends Product{
 private String expirationDate;
 private String  nutritionalValues;

    public Groceries(String name, double price, int quantity, String expirationDate, String nutritionalValues) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
        this.nutritionalValues = nutritionalValues;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getNutritionalValues() {
        return nutritionalValues;
    }

    public void setNutritionalValues(String nutritionalValues) {
        this.nutritionalValues = nutritionalValues;
    }

    @Override
    public String toString() {
        return "Groceries{" +
                "expirationDate='" + expirationDate + '\'' +
                ", nutritionalValues='" + nutritionalValues + '\'' +
                '}';
    }
}
