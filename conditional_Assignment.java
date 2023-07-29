// (1) Write a programe which take input from user of length and breadth and check it's square or note;

/*

import java.util.Scanner;

public class conditional_Assignment {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inter the value of Length : ");
        int Length = sc.nextInt();

        System.out.println("Inter the value of Breadth: ");
        int Breadth = sc.nextInt();

        if(Length == Breadth) {
            System.out.println("It's square");
        }
        else {
            System.out.println("It's Rectangle");
            
        }
    }
    
}

*/

// (3) Write program to take input from user to calculate profit or loss.

/* 

import java.util.Scanner;

public class conditional_Assignment {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        int p = sc.nextInt();

        System.out.println("Enter the rate of interest: ");
        int r = sc.nextInt();

        System.out.println("Enter the Time in year: ");
        int t = sc.nextInt();

        int Si = p*r*t/100;

        System.out.println("Simple Intrest = "+ Si);
    }

}

*/

// Creat a calculator mini calcualtor using swith operator;

/* 

import java.util.Scanner;

public class conditional_Assignment {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("Enter the first number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter the operation: ");
            char op = sc.next().charAt(0);

            System.out.println("Enter the second number: ");
            int num2 = sc.nextInt();

            switch(op) {

                case '+':
                System.out.println("Num1 + Num2 = " +(num1+num2) );
                break;

                case '-':
                System.out.println("Num1 - Num2 = "+(num1-num2));
                break;

                case '*':
                System.out.println("Num1 * Num2 = "+(num1*num2));
                break;

                case '/':
                System.out.println("Num1 / Num2 = "+(num1/num2));
                break;

                case '%':
                System.out.println("Remainder = "+(num1%num2));
                break;

                default :
                System.out.println("Error! Enter operation is incorect");
            
        }
    }
}

*/

