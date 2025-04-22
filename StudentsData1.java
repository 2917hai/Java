import java.util.*;
public class StudentsData1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        String roll;
        char section;
        int physics;
        int chemistry;
        int math;
        int hindi;
        int english;
        System.out.println("enter Name");
        name=sc.nextLine();
        System.out.println("enter Roll");
        roll=sc.nextLine();
        System.out.println("enter Section");
        section=sc.nextLine().charAt(0);
        System.out.println("enter Physics Marks");
        physics=sc.nextInt();

        System.out.println("enter Chemistry Marks");
        chemistry=sc.nextInt();

        System.out.println("enter Math Marks");
        math=sc.nextInt();

        System.out.println("enter Hindi Marks");
        hindi=sc.nextInt();

        System.out.println("enter english Marks");
        english=sc.nextInt();

        System.out.println("Your name is :"+name);
        System.out.println("roll :"+roll);
        System.out.println("section :"+section);
        System.out.println("your marks is :");
        System.out.println("Physics:"+physics);
        System.out.println("chemisrt:"+chemistry);
        System.out.println("Physics:"+math);
        System.out.println("hindi:"+hindi);
        System.out.println("english:"+english);
        int total=physics+chemistry+math+english+hindi;
        System.out.println("total marks:"+total);
        double per;
        per=total/
        


        
    }
}
