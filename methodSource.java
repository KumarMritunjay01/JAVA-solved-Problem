// 1. Write a Java method to find the smallest number among three numbers

public class methodSource {
    public static void printSmallestNumber(int num[],int i) {

        int SmallestNumber = num[0];
        System.out.println(num[i]);
    }
    
    public static void main(String[] args) {
        
        int num[] = {30,25,40};

        methodSource obj = new  methodSource();

        methodSource.printSmallestNumber(num , 3);
    }
}
