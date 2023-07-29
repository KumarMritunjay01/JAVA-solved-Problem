/* Rectangualr patteren;
 *  *  *  *  *  * 
 *  *  *  *  *  * 
 *  *  *  *  *  * 
 *  *  *  *  *  *  

*/

/* 

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows : ");
        int row = sc.nextInt();

        System.out.println("Enter the no. of column : ");
        int column = sc.nextInt();

        for(int i = 1 ;i<=row;i++){
                for(int j =1 ; j<=column;j++){
                System.out.print(" * ");
            }
        System.out.println();
        }
    }

}

*/

/* Hollow Rectangle :

******
*    *
*    *
******

*/
 
/* 

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int row = a.nextInt();

        System.out.println("Enter the column: ");
        int column = a.nextInt();

        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=column;j++){
                if(i==1 || j==1 || i==row || j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}

*/

/* Triangular pattern :
*
**
***
****

*/

/* 

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row: ");
        int row = sc.nextInt();

        System.out.println("Enter the value of column: ");
        int column = sc.nextInt();

        for(int i = 1;i<=row;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
}
}

*/

/*   Inverted triengle:
****
***
**
*

*/

/* 

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter the row: ");
        int row = s.nextInt();

        System.out.println("enter the column");
        int column = s.nextInt();

        for(int i = row;i>0;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

*/

/*  piramid :
        *
       ***        
      *****       
     *******      

*/

/* 

import java.util.Scanner;

public class pattern {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the No. of row: ");
        int n = sc.nextInt();

        for(int i = 0;i<=n;i++){
            for(int spc =0 ;spc<=2*n-i;spc++){
                System.out.print(" ");
            }
            for(int j =1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

*/

/* Numariacal Ractangula pattern :
 1 2 3 4
 1 2 3 4
 1 2 3 4
 1 2 3 4

*/

/* 

import java.util.Scanner;

public class pattern {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row: ");
        int n = sc.nextInt();

        for(int i = 1 ;i<=n;i++){
            for(int j = 1 ; j<=n;j++){
                System.out.print(" " +j);
                //System.out.print(" ");
            }
            System.out.println();
        }
    }
}

*/

/*  rectangular :  
 1 2 3 4 5 6      
 1 2 3 4 5 6      
 1 2 3 4 5 6      
 1 2 3 4 5 6

*/

/* 

import java.util.Scanner;

public class pattern {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row: ");
        int n = sc.nextInt();

        for(int i = 1 ;i<=n;i++){
            for(int j = 1;j<=(2*n)-2;j++){
                System.out.print(" " +j);
            }
            System.out.println();
        }
    }
}

*/

/*  try Another example: 
121212
121212
121212
121212

*/

/* 

import java.util.Scanner ;

public class pattern {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();

        for(int i =1;i<=n;i++){
            for(int j = 1;j<=2*n-2;j++){
                if(j%2==0){
                    System.out.print("2");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}

*/

/*  Numeric pyramid;

       1
      121
     12312        
    1234123    
    
*/

/* 

import java.util.Scanner;

public class pattern {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int spc=1;spc<=(2*n)-i;spc++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            for(int j =1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

*/

// Hollow Numeric Pyramid:

// import java.util.Scanner;

// class pattern {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the NO. of rows");
//         int n = sc.nextInt();

//         for(int i = 1;i<=n;i++){
//             for(int spc =1;spc<=2*n-i;spc++){
//                 System.out.print(" ");
//             }

//             for(int j =1;j<=2*i-1;j++){
//                 if(i==1 || j==1 || i==n || j == n){
//                     System.out.print(i);
//                 }
//                  else{
//                      System.out.print(" ");
//                  }
//             }

//             for(int spc =1;spc<=2*n-i;spc++){
//                 System.out.print(" ");
//             }

//             for(int j =1; j<=i;j++){
//                 if(i!=1 || j!=1 || j!=n || i!=n){
//                     System.out.print(i);
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }



/* Pattern

1
23
456
78910

*/

/* 

import java.util.Scanner;

class pattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the NO. of rows");
        int n = sc.nextInt();

        int k =1;
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}

*/

/* Pattern
1
01
101
0101
10101
 */

 /* 

import java.util.Scanner;
public class pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i%2 !=0 && j%2 !=0) || (i%2 ==0 && j%2 ==0)){ 

                    // or (i+j)%2==0 (print 1)

                    System.out.print("1");

                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

*/

/*  (10) BUTTERFLY PATTERN

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *


*/

/* 


import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        for(int i=1 ;i<=n;i++){
            for(int j =1 ;j<=i;j++){
                System.out.print("*");
            }
            for(int spc =1 ;spc<=2*(n-i);spc++){
                System.out.print(" ");
            }
            for(int j =1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n ;i>=1;i--){
            for(int j =1 ;j<=i;j++){
                System.out.print("*");
            }
            for(int spc =1 ;spc<=2*(n-i);spc++){
                System.out.print(" ");
            }
            for(int j =1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

*/

/*  Print Solid Rohombs:

        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *

*/

/* 

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n;i++){
            for(int spc =1 ;spc <= n-i;spc++){
                System.out.print("  ");
            }
            for(int j =1;j<=n;j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }

        
    }
}

*/

/*  PATTERN
    1
   2 2
  3 3 3 
 4 4 4 4
5 5 5 5 5

 */

 /* 

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int spc =1 ; spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(i +" ");
            }

            System.out.println();
        }
        
    }
}

*/

/*  Palendromic Pattern

    1
   212
  32123
 4321234
543212345

*/

/* 

import java.util.Scanner;

public class pattern {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int spc =1;spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j =i ;j>=1;j--){
                System.out.print(j);
            }

            for(int j =2 ;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}

*/

/*  Print DIAMOND Pattern

   *
  ***
 *****
*******
*******
 *****
  ***
   *
   
*/

/* 

import java.util.Scanner;

public class pattern {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the n: ");
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int spc =1;spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j =1 ;j<=i;j++){
                System.out.print("*");
            }
            for(int j =1 ;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=n;i>=1;i--){
            for(int spc =1;spc<=n-i;spc++){
                System.out.print(" ");
            }
            for(int j =1 ;j<=i;j++){
                System.out.print("*");
            }
            for(int j =1 ;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

*/

// Print Hollow Butterfly.

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        for(int i=1 ;i<=n;i++){
            for(int j =1 ;j<=i;j++){
               if(j==1 || i==j){
                System.out.print("*");
               }
               else{
                System.out.println(" ");
               }
            }
            // for(int spc =1 ;spc<=2*(n-i);spc++){
            //     System.out.print(" ");
            // }
            // for(int j =1 ;j<=i;j++){
            //     System.out.print("*");
            // }
            System.out.println();
        }

        // for(int i=n ;i>=1;i--){
        //     for(int j =1 ;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int spc =1 ;spc<=2*(n-i);spc++){
        //         System.out.print(" ");
        //     }
        //     for(int j =1 ;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
    }
}

