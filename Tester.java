import java.io.*; 
import java.util.*; 

public class Tester {
    public static void main( String args[] ) {
        Scanner kbReader = new Scanner(System.in); 
        System.out.print("Enter your integer here. "); 
        
        int i = kbReader.nextInt(); 
        System.out.println(3 * i); 
    }
}