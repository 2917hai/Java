import java.util.*;
public class ValidParenthesis {
    
    static void Pren(String str)
    {
        int first=0;
        int second=0;
        int third=0;
      int length=str.length();
      for(int i=0; i<length; i++)
      {
        if(str.charAt(i)=='(')
        {
            first++;
        }
        else if (str.charAt(i)==')')
        {
            first--;
        }
        else if (str.charAt(i)=='{')
        {
            second++;
        }
        else if (str.charAt(i)=='}')
        {
            second--;
        }
        else if (str.charAt(i)=='[')
        {
            third++;
        }
        else if (str.charAt(i)==']')
        {
            third--;
            
        }
      }
      boolean b1=true;
      char arr[]=str.toCharArray();
       int a=0;
       int b=str.length()-1;
       int mid=str.length()/2;
      for(int i=0; i<mid; i++)
      {
         if(arr[a]!=arr[b])
         {
           b1=false;
            break;
         }
            a++;
            b--;
      }
      if( first==0 && second==0 && third==0)
      {
        System.out.println("Valid Parenthesis");
      }
      else
      {
        System.out.println("Invalid Parenthesis");
      }
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String s1=sc.nextLine();
        Pren(s1);
       
    
    }
}
