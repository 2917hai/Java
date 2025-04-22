// import java.util.*;
// public class Tcs {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s1,s2;
//          boolean b=true;
//         System.out.println("Enter two string ");
//         s1=sc.nextLine();
//         s2=sc.nextLine();
//          System.out.println(s1.length()+""+s2.length());
//          int arr[]=new int[256];
    
//         for(int i=0; i<s1.length(); i++)
//         {
//             arr[s1.charAt(i)]++;
//         }
//         for(int i=0; i<s2.length(); i++)
//         {
//             arr[s2.charAt(i)]--;
//         }
//         for(int i=0; i<arr.length; i++)
//         {
//           if(arr[i]!=0)
//           {
//             b=false;
//             break;
//           }
        
//         }
        
//    if(b)
//    {
//     System.out.println("string are anagram");
//    }
//    else
//    {
//     System.out.println("string are not anagram");
//    }
  
  
// }
// }










// import java.util.*;
// public class Tcs
// {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         System.out.println("Enter a string ");
//         String s1=sc.nextLine();
//         boolean b=true;

//         char arr[]=s1.toCharArray();
//         int mid=arr.length/2;
//         System.out.println(mid);
//         System.out.println(arr.length);
//         for(int i=0;i<arr.length; i++)
//         {
//             System.out.println(arr[i]);
//         }
//         for(int i=0; i<mid; i++)
//         {
//             if(arr[i]!=arr[arr.length-i-1])
//             {
//                b=false;
//                break;
//             }
//         }
//         if(b)
//         {
//             System.out.println("string are palidrom");
//         }
//         else
//         {
//             System.out.println("string are not palidrom");
//         }
        
//     }
// }




import java.util.*;
public class Tcs{
    public static void main(String[] args) {
        int cp=0;
        int bp=0;
        int sp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string ");
        String s1=sc.nextLine();
        boolean b=true;

        for(int i=0; i<s1.length(); i++)
        {
            if(s1.charAt(i)=='(')
            {
              cp++;
            }
            else if (s1.charAt(i)=='{') {
                bp++;
                
            }
            else if(s1.charAt(i)=='[')
            {
                sp++;
            }
            else if(s1.charAt(i)==')')
            {
                cp--;
            }
            else if(s1.charAt(i)=='}')
            {
                bp--;
            }
            else if(s1.charAt(i)==']')
            {
                sp--;
            }
            else
            {
                System.out.println("Invalid character in string");
                break;
            }
            
        }
        
        
        char[] pali=s1.toCharArray(); 
        int length1=s1.length();
        int a1=0;
        int b1=length1-1;
        int mid1=length1/2;
        for(int i=0;i<mid1;i++)
        {
            if(pali[a1]!=pali[b1])
            {
                b=false;
                break;
            }
            a1++;
            b1--;
        }
      
      if(b && cp==0 && bp==0 && sp==0)
      {
        System.out.println("string is valid and balanced");
      }
      else
      {
        System.out.println("string is not valid and balanced");
      }
    }

}