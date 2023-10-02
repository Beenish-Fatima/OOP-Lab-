package LabAssignment;

public class Demo {
    public static void main(String[] args) {


        Employee e = new Employee("001", "Ali Zafar", "Lab Attendent");
        System.out.println(e);

        Computer c= new Computer("101","latest",64,128,true);
        System.out.println(c);

        Object o= new Object();
        System.out.println(o.equals(o));



    }
}
