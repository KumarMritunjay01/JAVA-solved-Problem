import java.util.Scanner;

class Complex {
    double real , img;

    Complex () {

    }
    Complex (float x, float y){
        real = x;
        img = y;
    }

    Complex add(Complex a){
        Complex temp = new Complex(); 
        temp.real = this.real+a.real;
        temp.img = this.img + a.img;
        return temp;

    }

    Complex sub (Complex a){
        Complex temp = new Complex();
        temp.real = this.real-a.real;
        temp.img = this.img-a.img;
        return temp;
    }

    public static void main(String [] args){
        Complex c1 = new Complex (10.3f,12.6f);
        Complex c2 = new Complex (4.4f,6.6f);
        Complex res;
         res = c1.add(c2);
        

         System.out.printf("Addition is %2.2f %2.2f ",res.real,res.img);

         res = c1.sub(c2);

         System.out.printf("\n subtraction is %2.2f %2.2f ",res.real,res.img);


    }
} 