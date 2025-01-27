import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        int no;
        System.out.println("1) for ask   2) for give  3) for tell  4) Exit");
        System.out.println("plese select the correct option");
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
        switch (no) {
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
