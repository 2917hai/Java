//   three type of data are use in switch =     integer    char and    string 
//    Logical expression not allowed
//    We can use arithmatic operator 
//    Switch in java always return type
//     Arrow operator eliminates  (->)      then no need System.out.println and break keyword
import java.util.*;
public class Switch1 {
    public static void main(String[] args) {
        int no;
        System.out.println("1) for ask   2) for give  3) for tell  4) Exit");
        System.out.println("plese select the correct option");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        switch (no) 
        {
            case 1:
                {
                    System.out.println("for ask");
                    break;
                }
            case 2:
            {
                System.out.println("for give");
                break;
            }
            case 3:
            {
                System.out.println("for tell");
                break;
            }
            case 4:
            {
                System.out.println("Exit");
                break;
            }
            default:
            {
                System.out.println("incorrect input data");
                break;
            }
               
        }
    }
}
