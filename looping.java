// Write a program to count the nuber of digit for a given number n;

/*

import java.util.Scanner;

public class looping {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int sum = 0;
        while(n>0){
            n = n/10;
            sum = sum + 1;
            
        }
        System.out.println(sum);
    }

    }

*/

// Write a program to sum of digit of a given number ;

/*

import java.util.Scanner;

public class looping {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int sum = 0;
        while(n>0){
            int digits = n%10;
            sum = sum + digits;
            n/=10;
        }

        System.out.println(sum);
    }

    }

*/

// Write a program to print Reverse the digits a number;

/* 

import java.util.Scanner;

public class looping {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        while(n>0){
            int digits = n%10;
            System.out.print(digits);

            n/=10;
        }
    }

    }

*/

// Write a program to find the sum of the following searies 
// s = 1-2+3-4.....n;

/* 

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class looping {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1 ; i<=n;i++){
            if(i%2 !=0){
                sum =sum+i;
            }
            else{
                sum=sum-i;
            }
        }
        System.out.println(sum);
    }
}

*/

// Write a program to print first n factorial number;

/* 

import java.util.Scanner;

public class looping {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int fact = 1;

        for(int i =1;i<=n;i++){
            fact *=i;
        }

        System.out.println(fact);
    }
}

*/

// Given 2 number a and b . Find a raise to power b;

import java.util.Scanner;

class sumOfLooping {
    public void powerOfNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a and b: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int mul = 1;
        for(int i =1 ;i<=b;i++){
            mul *= a;
        }

        System.out.println(mul);
    }
}
public class looping {
    public static void main(String[] args) {
        
        sumOfLooping obj = new sumOfLooping();

        obj.powerOfNumber();
        obj.powerOfNumber();
        obj.powerOfNumber();
    }
}