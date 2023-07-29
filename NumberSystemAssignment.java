//(1) Convert a Decimal Number into Binary number:

/* 

import java.util.Scanner;

public class NumberSystemAssignment {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter DecimalNumber : ");
        int decimal = sc.nextInt();

        int binary = 0;
        int paw = 1;

        while(decimal>0) {
            int piratyBits = decimal%2;
            binary +=(piratyBits*paw);
            paw *=10;
            decimal /=2;
        }

        System.out.println("The binary of given Decimal is : " +binary);

    }
}

*/

// (2) Convert Binary to decimal Number System :

/* 

import java.util.Scanner;

class NumberSystemAssignment {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Binary Number : ");
        int binary = sc.nextInt();

        int ans =0;
        int paw =1;
        while(binary>0){
            int unit_digits = binary%10;
            ans += (paw*unit_digits);
            paw *=2;
            binary /=10;
        }

        System.out.println("The binary of Given Decimal_number is : " +ans);
    }
}

*/

// (3) Add Two number Given in Different Base :1st Binary and 2nd Decimal And ans in Decimal:

/* 

import java.util.Scanner;

public class NumberSystemAssignment {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter biaray number: ");
        int binary = sc.nextInt();

        System.out.println("Enter the Decimal Number: ");
        int decimal1 = sc.nextInt();

        int decimal2 = 0;
        int paw =1;
        
        while(binary !=0){
            int unit_digit = binary%10;
            decimal2 += (unit_digit*paw);
            paw *=2;
            binary /=10;
        }

        System.out.println(decimal1 + decimal2);
    }
}

*/

// (4) Multiply two number given in defferent base :

/* 

import java.util.Scanner;

public class NumberSystemAssignment {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter biaray number: ");
        int binary = sc.nextInt();

        System.out.println("Enter the Decimal Number: ");
        int decimal1 = sc.nextInt();

        int decimal2 = 0;
        int paw =1;
        
        while(binary !=0){
            int unit_digit = binary%10;
            decimal2 += (unit_digit*paw);
            paw *=2;
            binary /=10;
        }

        System.out.println(decimal1 * decimal2);
    }
}

*/

//(5) Convert a decimal Double number into Binary string upto k precision digits :

