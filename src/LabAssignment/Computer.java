package LabAssignment;

import java.util.Objects;

public class Computer {

    String computerNumber;
    String lcdModel;
    int ramSize;
    int hddSize;
    boolean hasGPU;

    public Computer(String computerNumber, String lcdModel, int ramSize, int hddSize, boolean hasGPU) {
        this.computerNumber = computerNumber;
        this.lcdModel = lcdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }

    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getIcdModel() {
        return lcdModel;
    }

    public void setIcdModel(String icdModel) {
        this.lcdModel = icdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramSize == computer.ramSize && hddSize == computer.hddSize && hasGPU == computer.hasGPU && Objects.equals(computerNumber, computer.computerNumber) && Objects.equals(lcdModel, computer.lcdModel);
    }

    public Computer clone(){
        return new Computer("null","null",64,128,true);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerNumber='" + computerNumber + '\'' +
                ", lcdModel='" + lcdModel + '\'' +
                ", ramSize=" + ramSize +
                ", hddSize=" + hddSize +
                ", hasGPU=" + hasGPU +
                '}';
    }
}
