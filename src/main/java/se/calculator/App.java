package se.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
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

            //__
            try {
                System.out.print("The number of operation: ");
                int operation = scanner.nextInt();

                if (operation < 1 || operation > 5) {
                    System.out.println("__________________");
                    System.out.println("<<<< Invalid >>>>");
                }
                else if ( operation == 5) {
                    isNotExit = false;
                    System.out.println("The operation is exit.");
                }
                else{
                    System.out.print("Write the 1st number: ");
                    long firstNum = scanner.nextInt();
                    System.out.print("Write the 2nd number: ");
                    long secondNum = scanner.nextInt();
                    //__
                    long addition = addition(firstNum, secondNum);
                    long subtraction = subtraction(firstNum, secondNum);
                    long multiplication = multiplication(firstNum, secondNum);
                    double division = division((double) firstNum, (double)secondNum);
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
                    else{
                        System.out.println("Result: " + division);
                    }
                }
            }catch (InputMismatchException exception){
                System.out.println("**************************");
                System.out.println("Input error: The input is not an integer or is too big");
                scanner.next();
            }

        }
        scanner.close();
    }


    public static long addition(long a,long b){
        return a + b;
    }

    public  static long subtraction(long a, long b){
        return a - b;
    }

    public static long multiplication(long a, long b){
        return a * b;
    }

    public static  double division(double a, double b){
        if (b == 0){
            System.out.println("You can not divide by zero.");
            return Double.NaN;
        }
        else {
            return a / b;
        }
    }
}

