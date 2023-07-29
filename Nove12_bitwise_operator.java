import javax.sound.sampled.SourceDataLine;

public class Nove12_bitwise_operator {

    public static void main(String[] args) {
        int p = 9;
        int q = 10;

        System.out.println(p|q);   // Bitwise OR
        System.out.println(p&q);   // Bitwise AND
        System.out.println(p^q);   // Bitwisee XOR
        System.out.println(p>>1);  // Right Sift  p/2
        System.out.println(p<<1);  // Left Sift  p*2
        System.out.println(~p);    // Bitwise Complement 
    }
    
}
