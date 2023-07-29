

// Initialize the 1D array 

// data type ,[] , Array name , = , new , data type, [size];
// data type ,[] , Array name , = {1,2,3,4,5};

/* 

class Array {

    public void demoArray(){

        int[] age = new int[3];
        float[] weights = new float[3];
        String [] names = new String[3];

        age[0] = 21;
        age[1] = 19;
        age [2] = 18;
        names[0] = "Mritunjay";
        names[1] = "Harsh";
        names [2] = "Kasim";

        weights [0] = 60.0f;
        weights [1] = 55.0f;
        weights [2] = 45.0F;

        System.out.println("Name: " +names[0]);
        System.out.println("Age: " +age[0]);
        System.out.println("And weight: " +weights[0]);

        System.out.println("Name: " +names[1]);
        System.out.println("Age: " +age[1]);
        System.out.println("And weight: " +weights[1]);

        System.out.println("Name: " +names[2]);
        System.out.println("Age: " +age[2]);
        System.out.println("And weight: " +weights[2]);

        System.out.println(age.length);

        for(int i =0;i<age.length;i++){
            System.out.println(age[i]);
        }

        for(int i =0;i<weights.length;i++){
            System.out.println(weights[i]);
        }
        
        for(String i : names){
            System.out.println(i);
        }

        for(int i : age){
            System.out.println(i);
        }

        int i =0;
        while(i<age.length){
            System.out.println(age[i]);
            i++;
        }
        
        // float x =0.0f;
        // while(i<weights.length){
        //     System.out.println(weights[x]);    // Wrong
        //     x++;
        // }

    }
    
}

public class Nov14_Array{
    public static void main(String[] args) {
        
        Array obj = new Array();

        obj.demoArray();
    }

}

*/

//Initialize the 2D array ;

// data type ,[] , Array name , = , new , data type, [size];

// data type ,[] ,[], Array name , = , new , data type, [size],[size];

// // data type ,[] ,[] , Array name , = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};

/* 

class printArray {   // printArray class:

    // int [] [] Array = new int [4][3];
    // Array[0][0]=1;
    // Array[0][1]=3;
    // Array[0][2]=5;

    public void demo(){   // demo Method

    int [] [] Array = {{1,3,4},{2,4}};

    // System.out.println(Array[1][1]);

    System.out.println(Array.length);

    System.out.println(Array[1].length);

    for(int i =0 ;i<Array.length;i++){
        for(int j =0 ;j<Array[i].length;j++){
            System.out.println(Array[i][j]);
        }
    }

    }

}

public class Nov14_Array {

public static void main(String[] args) {
    
    printArray obj = new printArray();

    obj.demo();
}
    
}

*/

// (1) Calculat the sum of all element given in the array:


/* 

class sumOfElement {
    public void sumOfArray() {
        int [] Array = {7,8,5,2,4,6,1,3,10};

        int sum = 0;
        for(int i =0 ; i<Array.length;i++) {
            sum +=Array[i];
        }
        System.out.println("Sum of element of the array is: " +sum);
        System.out.println("size of the array is: " +Array.length);

    }
}

public class Nov14_Array {
    public static void main(String[] args) {
        sumOfElement obj = new sumOfElement();

        obj.sumOfArray();

    }

}

*/

//(2) Print the maximum value out of element present in the array :

/* 

class printArray{
    public void largestElement (){
        int [] array = { 1 ,4 ,7 ,8 ,9 ,6 ,3 ,2, 5 ,0};

        int max = array[0]; 
        for(int i =1 ;i<9;i++){
            if(max<array[i]){
                max = array[i];
            }
        }

        System.out.println("Maximum element in the array is " +max);
    }

}

public class Nov14_Array {
    public static void main(String[] args) {
        printArray obj = new printArray();

        obj.largestElement();
    }
}

*/

//(3) Search the given element X in the array. If present in the array return index else return -1:

import java.util.Scanner;
class Array {
    public void serchingElement() {

        int [] num = {4,5,6,1,2,8,10,15,45 };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x:");
        int x = sc.nextInt();

        for(int i =0;i<num.length;i++){
            if(num[i]==x){
                System.out.println(i);
            }
        }

    }
}

public class Nov14_Array {
    public static void main(String[] args) {
        Array obj = new Array();

        obj.serchingElement();
    }
}
