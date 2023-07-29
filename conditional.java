// if_else statement  

// Write a java program to print odd enven taking input from user;

/*

import java.util.Scanner;

public class conditional {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num : ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Given num is Even");
        }
        else {
            System.out.println("Given Num is odd");
        }
    }
    
}

*/

// if , else if , else , statment ;

// Write a program to print child , adult and old;

/* 

import java.util.Scanner;

class conditional {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age<=14){
            System.out.println("You are child");
        }
        else if (age<=30){
            System.out.println("You are young");
        }
        else{
            System.out.println("You are old");
        }
    }
}

*/

// Nasted if else statment ;

// write a program to print the value if it is even and divisible by 3.

/* 

import java.util.Scanner;

public class conditional {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num%2==0){
            if(num%3==0){
                System.out.println(num);
            }
        }
        
    }
}

*/

// Write a program to print the value of if it is divisible by 3 or 5;

/*

import java.util.Scanner;

public class conditional {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value");
        int value = sc.nextInt();

        if(value%3==0 || value%5==0){
            System.out.println("value is: " + value);
        }
    }
} 

*/

// Switch case ;

/* switch(Exprestion) {
    cace 1:
    //code
    break;
    case 2:
    //code
    break;
    default:
    //code
*/

// write a program to print the day based on the day number. Day:1 Monday .....Day:7 Sunday;

/* 

import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Day");
        int day = sc.nextInt();
        switch(day) {
            case 1: 
            System.out.println("Monday");
            break;

            case 2: 
            System.out.println("Tuesday");
            break;

            case 3: 
            System.out.println("Wednesday");
            break;

            case 4: 
            System.out.println("Thursday");
            break;

            case 5: 
            System.out.println("Friday");
            break;

            case 6: 
            System.out.println("Saturday");
            break;

            case 7: 
            System.out.println("Sunday");
            break;

            default:
            System.out.println("Sorry enter value is incorect");
            break;
        }
    }
}

*/

