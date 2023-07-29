import java.util.Scanner;

class Publication {
    String title;   // instance variable :
    int copies ,price;
    void salecopy(){  // method:

    }
}

class Book {

    String title;
    int copies ,price;
    void saleCopy(){
        price = 300;
        System.out.println("Total sale: " + copies*price);
    }
    void orderCopy() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coppies: ");
        copies = sc.nextInt();
    }

}

class Mgazine{
    String title;
    int copies ,price;
    void salecopy(){
        
    }

    void orderQty() {

    }
    void receiveIssue(){

    }

}

public class pubs {

    public static void main(String[] args) {
        Book b = new Book();
        b.orderCopy();
        b.saleCopy();
    }
    
}
