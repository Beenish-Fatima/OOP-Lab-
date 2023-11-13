package Metro;

public class Furniture extends Product{
    private String material;
    private String dimensions;

    public Furniture(String name, int price, int stockQuantity, String taxation, String material, String dimensions) {
        super(name, price, stockQuantity, taxation);
        this.material = material;
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "material='" + material + '\'' +
                ", dimensions='" + dimensions + '\'' +
                '}';
    }
}
