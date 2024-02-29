package se.calculator;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        boolean isNotExit = true;
        while(isNotExit){
            System.out.println("*********************");
            System.out.println("Choose the operation:");
            System.out.println("*********************");
            System.out.println("1- Addition:");
            System.out.println("2- Subtraction.");
            System.out.println("3- Multiplication.");
            System.out.println("4- Division.");
            System.out.println("5- Exit.");

            Scanner userFirstNum = new Scanner(System.in);
            Scanner userSecondNum = new Scanner(System.in);
            Scanner scannerOperation = new Scanner(System.in);
            //__operation
            System.out.print("The number of operation: ");
            int operation = scannerOperation.nextInt();
            if (operation < 1 || operation > 5) {
                System.out.println("**************************");
                System.out.println("<<<<< Invalid >>>>>");
            }
            else if ( operation == 5) {
                isNotExit = false;
                System.out.println("The operation is exit.");
            }
            else{
                    System.out.print("Write the 1th number: ");
                    int firstNum = userFirstNum.nextInt();
                    System.out.print("Write the 2th number: ");
                    int secondNum = userSecondNum.nextInt();
                    //__
                    int addition = addition(firstNum, secondNum);
                    int subtraction = subtraction(firstNum, secondNum);
                    int multiplication = multiplication(firstNum, secondNum);
                    int division = division(firstNum, secondNum);
                    //__
                    if (operation == 1){
                        System.out.println("Result: " + addition);
                    }
                    else if (operation == 2){
                        System.out.println("Result: " + subtraction);
                    }
                    else if (operation == 3){
                        System.out.println("Result: " + multiplication);
                    }
                    else if (operation == 4){
                        System.out.println("Result: " + division);
                    }
            }
        }
    }


    public static int addition(int a,int b){
        return a + b;
    }

    public  static int subtraction(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static  int division(int a, int b){
        return a/b;
    }
}

