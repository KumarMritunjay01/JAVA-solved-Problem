// (1) Given the array of integer {2,6,-5,0,4,-9} print only positive value in the array:

/* 

public class Assignment_array {
    public static void main(String[] args) {
        
    int [] array = {2,6,-5,0,4,-9} ;

    System.out.println("Size of the array is : " +array.length);

    System.out.print("And positive integer is: ");

    for(int i =0;i<array.length;i++){
        if(array[i]>0){
            System.out.print(array[i] +" ");
        }
    }
    }
}

*/

// (2) The list of String {"ab","bc","cd","de","ef","fg","gh"} into a array of string and print
//     all string present at the odd indices of the array:

/* 

public class Assignment_array {

    public static void main(String[] args) {
        
        String[] name = {"ab","bc","cd","de","ef","fg","gh"};

        for(int i =0 ;i<name.length ;i++){
            if(i%2 !=0){
                System.out.println(name[i]);
            }
        }
    }
}

*/

//(3) Travers over the element of the array {1,2,3,4,5,6,7,8,9} using for each loop and print all even element:

/*

public class Assignment_array {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};

        System.out.println("Size of the array : " +array.length);

        for(int i =0 ;i<array.length;i++){
            if(array[i]%2==0){
                System.out.print(array[i] +" ");
            }
        }
    }

}

*/

// (4) Calculate the minimum element in the array using standered library method:

// (5) 