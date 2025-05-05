import java.util.Scanner;
public class NumberToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int no;
        no = sc.nextInt();
        int i = 0; 
      
      
        while (no>=0) {
           int r = no % 2; 
           
            no = no / 2; 
            i++; 
            
        }
       
      
       
    }
}
