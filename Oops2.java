import java.util.*;
class Employee
{
    //  jab object banate hai to uske member data ko initialize karne ke liye constructor ka use karte hai
    // constructor he memory allocate krta hai 
    // aur sab ko by default value de dete hai
    // jab bhi object banate hai to constructor call hota hai  jo default value set karta hai
    // constructor is a special type of function which is used to initialize the member data of the class
    String Name;
    String Email;
    String EmployeeID;
    String MobileNumber;
    String Department;

    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of employee");
        Name=sc.nextLine();
        System.out.println("Enter the email of employee");
        Email=sc.nextLine();
        System.out.println("Enter the employee ID");
        EmployeeID=sc.nextLine();
        System.out.println("Enter the mobile number of employee");
        MobileNumber=sc.nextLine();
        System.out.println("Enter the department of employee");
        Department=sc.nextLine();
    }
    void showdata()
    {
        System.out.println("Name of employee: " + Name);
        System.out.println("Email of employee: " + Email);
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Mobile Number of employee: " + MobileNumber);
        System.out.println("Department of employee: " + Department);
    }
}
 class Students
 {
    String name;
    int rollno;
    String email;
    int Hindi;
    int English;
    int Maths;
    int Science;
    int Social;
    char section;
    int total;
    float percentage;
    String grade;

    void getdata()
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the name of student");
         name = sc.nextLine();
         System.out.println("Enter the roll number of student");
            rollno = sc.nextInt();
            System.out.println("Enter the email of student");
            email = sc.next();
            System.out.println("Enter the section of student");
            section = sc.next().charAt(0);
    }
    void showdata()
    {
        System.out.println("Name of student: " + name);
        System.out.println("Roll number of student: " + rollno);
        System.out.println("Email of student: " + email);
        System.out.println("Section of student: " + section);
    }
    void getmarks()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Hindi");
        Hindi = sc.nextInt();
        System.out.println("Enter the marks of English");
        English = sc.nextInt();
        System.out.println("Enter the marks of Maths");
        Maths = sc.nextInt();
        System.out.println("Enter the marks of Science");
        Science = sc.nextInt();
        System.out.println("Enter the marks of Social");
        Social = sc.nextInt();
        total = Hindi + English + Maths + Science + Social;
        percentage = (float) total / 5;
    }
    void showresult()
    {
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage+"%");
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B+";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("Grade: " + grade);
    }
 }

public class Oops2
{
    float r; // member data


    void getdata() // member function
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the value of radius");
        r = sc.nextFloat();
    }
    void area() // member function
    {
        System.out.println("Area of circle = " + Math.PI*Math.pow(r, 2));
    }
    void circumference() // member function
    {
        System.out.println("Circumference of circle = " + (2 * Math.PI * r));
    }
    public static void main(String[] args) {
        Oops2 obj=new Oops2();
        obj.getdata();
        obj.area();
        obj.circumference();

        Students st=new Students();
        st.getdata();
        st.getmarks();
        st.showdata();
        st.showresult();

        Employee emp=new Employee();
        emp.getdata();
        emp.showdata();



        
    }
}