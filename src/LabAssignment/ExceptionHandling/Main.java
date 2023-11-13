package LabAssignment.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};


        Scanner sc= new Scanner(System.in);

        try {
            int x= sc.nextInt();
            int y= sc.nextInt();
            System.out.println(arr[10]);
        }
        catch (InputMismatchException e){
            System.out.println("Mismatched input");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
        finally {
            System.out.println("finally!");
        }

    }
}
