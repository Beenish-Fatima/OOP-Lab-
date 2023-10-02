package LabAssignment;

public class Lab {

    String labID;

    Computer computer[];

    public Lab(String labID, Computer[] computer, String labStatus, Employee e) {
        this.labID = labID;
        this.computer = computer;
        this.labStatus = labStatus;
        this.e = e;
    }


    String labStatus;
    Employee e = new Employee("001", "Ali Zafar", "Lab Attendent");

    public Computer addComputer() {
        int counter = 1;
        for (int i = 0; i < computer.length; i++) {
            counter++;
        }
        return null;
    }


    public boolean removeComputer(String computerNumber){
       return true;
    }

    public String getComputer(String computerNumber){
        return computerNumber;
    }

}