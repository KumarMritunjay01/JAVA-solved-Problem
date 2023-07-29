import java.io.*;
class creatFile {
    public static void main(String[] args) {
        File f = new File(C:\Users\kmrit\OneDrive\Desktop\mk.txt);
        
        try{

            if(f.creatNewFile()){
                System.out.println("file created");
            }
    
            else{
                System.out.println("Error");
            }
        }

        catch(Exception e){
            System.out.println("exception Handele");
        }
        
    }
}
