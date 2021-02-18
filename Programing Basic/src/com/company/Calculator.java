package com.company;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        int operation;
        float num1;
        float num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator\n");
        do
        {
            System.out.println("Choose Operation to perform");
            System.out.println("1 : Addition ");
            System.out.println("2 : Subtraction ");
            System.out.println("3 : Multiplication ");
            System.out.println("4 : Division ");
            System.out.println("5 : Exit ");
            operation = sc.nextInt();
            if(operation == 5)
            {
                System.out.println("Exiting program...");
                break;
            }
            System.out.println("Enter Number 1");
            num1 = sc.nextFloat();
            System.out.println("Enter Number 2");
            num2 = sc.nextFloat();
            try
            {
                switch (operation)
                {
                    case 1:
                        float sum = num1 + num2;
                        System.out.println("Addition is " + sum);
                        break;
                    case 2:
                        float sub = num1 - num2;
                        System.out.println("Addition is " + sub);
                        break;
                    case 3:
                        float mul = num1 * num2;
                        System.out.println("Addition is " + mul);
                        break;
                    case 4:
                        float division = num1 / num2;
                        System.out.println("Addition is " + division);
                        break;
                }
            }
            catch (Exception e)
            {
                System.out.println("Something went wrong...");
            }
        }while(operation > 4);

    }
}
