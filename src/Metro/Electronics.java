package Metro;

public class Electronics extends Product{
    private String powerConsumption;
    private String warranty;


    public Electronics(String name, int price, int stockQuantity, String taxation, String powerConsumption, String warranty) {
        super(name, price, stockQuantity, taxation);
        this.powerConsumption = powerConsumption;
        this.warranty = warranty;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    @Override
    public String  toString() {
        return "Electronics{" +
                "powerConsumption='" + powerConsumption + '\'' +
                ", warranty='" + warranty + '\'' +
                '}';
    }
}
