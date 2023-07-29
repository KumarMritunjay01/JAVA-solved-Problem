// Takin Input
//Salow copy & Dip coppy
//cloning an array  (for dip copy)

// Taking Input:

/*

import java.util.Scanner;

public class Nov16_takingArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        
        int [] arr = new int[size];

        System.out.println("Enter the element of the array: ");
        for(int i =0 ;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        
    }
}

*/

/* 

import java.util.Arrays;
public class Nov16_takingArrayInput{

    public static void printArr(int [] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int [] arr = new int[5];

        arr [0] = 9;
        arr [1] = 8;
        arr [2] = 7;
        arr [3] = 6;
        arr [4] = 5;

        System.out.print("Original Array: ");
        printArr(arr);

        System.out.print("Copied Array: ");

     //   int [] arr2 = arr;

        // or

     //   int [] arr2 = arr.clone();    // clone() is use for new alocation;

     // or

      int [] arr2 = Arrays.copyOf(arr , arr.length); // using util.Arrays method:

        printArr(arr);

        arr2[0]=0;
        arr2[1]=0;

        System.out.print("Original Array After changes: ");
        printArr(arr);

        System.out.print("Copied Array After changes: ");
        printArr(arr2);
    }
}

*/


// Count the number of occurrences of a particular elemet X:

/* 

import java.util.Scanner;
public class Nov16_takingArrayInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");  
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter the Element of array: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count ++;
            }
        }

        System.out.println(count);
    }
}

*/


// Find the last occurrence of an element x in a given array:

/*

import java.util.Scanner;
public class Nov16_takingArrayInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");  
        int size = sc.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter the Element of array: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        int lastOcurence = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastOcurence = i;
            }
        }
        System.out.println(lastOcurence);
    }
}

*/

// Count  the number of element strictly greater than value X :

// check Given Array is sorted or not ;

//
ksj
