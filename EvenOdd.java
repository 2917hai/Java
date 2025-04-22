// import java.*;
// import java.util.Scanner;
// public class EvenOdd {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter any number");
//         int n=sc.nextInt();
//         if(n%2==0)
//         {
//             System.out.println("even no");
//         }
//         else{
//             System.out.println("odd no");
//         }
//     }
// }



import java.util.*;
public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible for voting");
        }
        else
        {
            System.out.println("you are not eligible for voting");
        }
    }
}
