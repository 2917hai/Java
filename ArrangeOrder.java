import java.util.*;
public class ArrangeOrder {
    public static void main(String[] args) {
        System.out.println("Enter three words");
        Scanner sc=new Scanner(System.in);
        String word1, word2, word3;
        word1=sc.nextLine();
        word2=sc.nextLine();
        word3=sc.nextLine();
        if (word1.compareTo(word1)>0 ){
            String temp=word1;
            word1=word2;
            word2=temp;
        }
         if (word2.compareTo(word3)>0) {
            String temp1=word2;
            word2=word3;
            word3=word2;
            
        }
        if (word2.compareTo(word3)>0) {
            String temp1=word2;
            word2=word3;
            word3=word2;
            
        }
        System.out.println(word1+""+word2+""+word3);
        
        
    }
    
}
