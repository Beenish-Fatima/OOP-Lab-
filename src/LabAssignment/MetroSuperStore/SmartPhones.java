package LabAssignment.MetroSuperStore;

public class SmartPhones extends Electronics{
    private String operatingSystem;
    private String  storageCapacity;
    private String cameraResolution;

    public SmartPhones(String operatingSystem, String storageCapacity, String cameraResolution) {
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.cameraResolution = cameraResolution;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "SmartPhones{" +
                "operatingSystem='" + operatingSystem + '\'' +
                ", storageCapacity='" + storageCapacity + '\'' +
                ", cameraResolution='" + cameraResolution + '\'' +
                '}';
    }
}
