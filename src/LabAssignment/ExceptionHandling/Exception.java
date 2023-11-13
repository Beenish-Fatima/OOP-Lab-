package LabAssignment.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println(sc.nextInt());

        Division d= new Division();


        int a=10;
        int b=0;

       //  Scanner input= new Scanner(System.in);


        int arr[]={0,1,2,3,4,5};

        Scanner input= new Scanner(System.in);
        int x= input.nextInt();
        int y= input.nextInt();


        try{

            int result=d.division(x,y);
            System.out.println(result);


            System.out.println(arr[10]);
            System.out.println("a/b="+(a/b));

            int sc1= input.nextInt();
            int sc2= input.nextInt();
            System.out.println("a/b="+(sc1/sc2));
        }


        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception!");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }

        catch(InputMismatchException e){
            System.out.println("Input Mismatch Exception");
        }

        finally {
            System.out.println("Inside Finally!");
        }

        System.out.println("Thank You!");
    }

}
