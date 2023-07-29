
// import java.util.Scanner;

// public class Function {
//     public static void printMyName(String name){
//         System.out.println(name);

//         return;
//     }

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String name = sc.next();

//         printMyName(name);
//     }
// }

// Make a function to add two number:

/* 

import java.util.Scanner;

public class Function {

    public static int calculateSum(int num1 , int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 and num2: ");
        int num1= sc.nextInt();
        int num2 = sc.nextInt();

        int sum = calculateSum(num1,num2);
        System.out.println(sum);

        
    }
}

*/

// Make a function to multiply two number;

/* 

import java.util.Scanner;

public class Function {
    public static int multiplicationOfTwoNumber(int num1,int num2){
        return num1*num2;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of num1 and num2: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int product = multiplicationOfTwoNumber(num1,num2);

        System.out.println("Product is : " +product);
    }
}

*/

// Find the factorial of a number;

import java.util.Scanner;

public class Function {
    public static void printFactorial(int num){

        if(num<0){
            System.out.println("Invilid syntax:");
            return;
        }

        int fact =1;
        for(int i =num;i>0;i--){
            fact *=i;
        }

        System.out.println(fact);
        return;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        printFactorial(num);


    }
}