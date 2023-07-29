// Creat a class named 'student' with string variable 'name' and integer variable 'rol_no'.Assign
// the value of roll_no '2' and that of name as 'john' by creating an object of the class student.

/* 

class Student {
    String name ;
    int roll_no;
    
}

public class opps_assignment{
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "john";
        s.roll_no = 2;

        System.out.println("Name is: " +s.name);
        System.out.println("And Roll No. is : "+s.roll_no);
    }

}

*/

// Write a program to print area and paremeter of triangle having side of 3,4 and 5 units by
// creat a class named 'Triangle' without any parameter in its constructor.

class Triangle {
    int base = 3;
    int hight = 4;
    int hypotenius = 5;

    float area = 0.5*base*hight;
}

public class opps_assignment {
    public static void main(String[] args) {

        Triangle a= new Triangle();
        a.area = 1/2*(base*hight);
        
    }
}