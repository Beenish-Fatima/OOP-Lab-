package LabAssignment.MetroSuperStore;

public class Attributes {
    private int ID;
    private String name;
    private String value;

    public Attributes(int ID, String name, String value) {
        this.ID = ID;
        this.name = name;
        this.value = value;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Attributes{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
