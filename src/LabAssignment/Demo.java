package LabAssignment;

public class Demo {
    public static void main(String[] args) {


        Computer c1 = new Computer("C001", "LCD-001", 8, 512, true);
        Computer c2 = new Computer("C002", "LCD-002", 16, 1024, false);


        Employee e = new Employee("001", "Ali Zafar", "Lab Attendent");
        System.out.println(e);

        Computer c= new Computer("101","latest",64,128,true);
        System.out.println(c);

        Object o= new Object();
        System.out.println(o.equals(o));



    }
}
