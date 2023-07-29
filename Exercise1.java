// (1) Enter 3 number from the user & make a function to print their average;

/* 

import java.util.Scanner;

public class Exercise1 {

    public static float Average(int a, int b, int c){
        return (a*b*c)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a b and c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float ave = Average(a,b,c);
        System.out.println(ave);
    }
}

*/

// 3. Write a function which takes in 2 numbers and returns the greater of those two.

/* 

import java.util.Scanner;

public class Exercise1 {
    public static int getGreator (int num1 , int num2){
        if(num1>num2){
            return num1;
        }
        else{
           return num2;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter the num1 and num2: ");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int ans = getGreator(num1 , num2);
    
        System.out.println("Greator Num is : " +ans);
    }
}

*/

// 4. Write a function that takes in the radius as input and returns the circumference of a circl

/* 

import java.util.Scanner;

public class Exercise1 {
    public static double getCircumference(double radius){
        return 2*3.14*radius;

    }

    public static void main(String[] args) {
        System.out.println("Enter the radius of circle: ");
        Scanner sc = new Scanner(System.in);

        int radius = sc.nextInt();
         double Circumference = getCircumference(radius);

        System.out.println(Circumference);
    }
}

*/

//5. Write a function that takes in age as input and returns if that person is eligible to vote or not. 
//    A person of age > 18 is eligible to vote

/* 

import java.util.Scanner;

public class Exercise1 {
    public static boolean isEligible(int age){
        if(age>=18){
            return true;
        }

        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = sc.nextInt();

        System.out.println(isEligible(age));
    }
}

*/

