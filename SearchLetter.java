import java.util.*;
public class SearchLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String word;
        word=sc.nextLine();
        char key;
        key=sc.nextLine().charAt(0);
        int size=word.length();
        for(int i=0; i<=size; i++)
        {
            if(word.charAt(i)==key)
            {
                System.out.println("available");
                
            }
            else
            {
                System.out.println("not available");
                
            }
        }
    }  
}
