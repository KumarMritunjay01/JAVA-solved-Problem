class Student {
    String name = "ram" ;
    int age = 20;
    
    public Student () {}  // Default constructor:
    
    public Student(String sname,int sage){ // parametrise constructor:
        sname = name;
        sage = age;
        System.out.println(sname);
        System.out.println(age);
    }
    
    public Student(Student s1){
        name = s1.name;
        age = s1.age;
        System.out.println(name);
        System.out.println(age);
    }
}

public class Demo {
    public static void main(String [] args){
        Student s2 = new Student("ram", 20);
        Student s3 = new Student(s2);
        
        
    }
}