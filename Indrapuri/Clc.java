import java.util.*;
public class Clc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int choice;
    System.out.println("Welcome to calculator");
    System.out.println(" 1 for addition, \n 2 for subtraction, \n 3 for multiplication,\n 4 for division, \n 5 for modulus");
    choice=sc.nextInt();
    switch (choice) {
        case 1:
        {
            System.out.println("Enter two numbers for addition");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a+b;
            System.out.println("Addition is "+c);
            break;
        }
        case 2:
        {
            System.out.println("Enter two numbers for subtraction");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a-b;
            System.out.println("Subtraction is "+c);
            break;
        }
        case 3:
        {
            System.out.println("Enter two numbers for multiplication");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a*b;
            System.out.println("Multiplication is "+c);
            break;
        }
        case 4:
        {
            System.out.println("Enter two numbers for division");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(b==0)
            {
                System.out.println("Division by zero is not possible");
            }
            else
            {
                int c=a/b;
                System.out.println("Division is "+c);
            }
            
            break;
        }
        case 5:
        {
            System.out.println("Enter two numbers for modulus");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a%b;
            System.out.println("Modulus is "+c);
            break;
        }
    
    
        default:
        {
            System.out.println("Invalid choice");
            break;
        }
            
    }
        
    }
}
