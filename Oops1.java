import java.util.*;
public class Oops1 {
    int a; // member data
    int b; // member data
     void get()   // member function
     {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the value of a and b");
         a = sc.nextInt();
         b = sc.nextInt();
        
     }
     void dispaly()  // member function
     {
         System.out.println("a = " + a);
         System.out.println("b = " + b);
     }
     void area()   // member function
     {
         System.out.println("Area = " + (a * b));
     }
     void perimeter()   // member function
     {
         System.out.println("Perimeter = " + (2 * (a + b)));
     }
    public static void main(String[] args) {
        System.out.println("Object and class");
        /*
         * 
         *  Why we make a class - it is usefull for create a userdefined data type 
         *   Class is collection of member data and data function
         * 
         * member data- state, attribute and Properties
         * member function- it is act as a madiator between user and data
         * 
         * 
         */
        Oops1 obj = new Oops1();
        obj.get();
        obj.dispaly();
        obj.area();
        obj.perimeter();
    }
}
