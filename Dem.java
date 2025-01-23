import java.util.Scanner;
public class Dem
{

 public static void main(String []args)
  {
    Scanner sc= new Scanner(System.in);
    String name;
    int rollNo;
    char section;
    char grade;
    System.out.println("enter your name");
    name=sc.nextLine();
    System.out.println("enter your roll no");
    rollNo=sc.nextInt();
    sc.nextLine();
    System.out.println("enter your sectoin");
    section=sc.nextLine().charAt(0);
    System.out.println("enter grade");
    grade=sc.nextLine().charAt(0);
    System.out.println(name);
    System.out.println(rollNo);
    System.out.println(section);
    System.out.println(grade);

 

  }
}