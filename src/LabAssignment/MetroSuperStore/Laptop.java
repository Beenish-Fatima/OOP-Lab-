package LabAssignment.MetroSuperStore;

public class Laptop extends Electronics{
    private String processorType;
    private String ramsize;
    private String screenDimensions;

    public Laptop(String name, double price, int quantity, String powerConsumption, String warranty, String processorType, String ramsize, String screenDimensions) {
        super(name, price, quantity, powerConsumption, warranty);
        this.processorType = processorType;
        this.ramsize = ramsize;
        this.screenDimensions = screenDimensions;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getRamsize() {
        return ramsize;
    }

    public void setRamsize(String ramsize) {
        this.ramsize = ramsize;
    }

    public String getScreenDimensions() {
        return screenDimensions;
    }

    public void setScreenDimensions(String screenDimensions) {
        this.screenDimensions = screenDimensions;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processorType='" + processorType + '\'' +
                ", ramsize='" + ramsize + '\'' +
                ", screenDimensions='" + screenDimensions + '\'' +
                '}';
    }
}
