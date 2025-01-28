import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        char choice;
        System.out.println("A) for ask   B) for give  C) for tell  D) Exit");
        System.out.println("plese select the correct option");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextLine().charAt(0);
        switch (choice) {
            case 'A':
                {
                    System.out.println("for ask");
                    break;
                }
            case 'B':
            {
                System.out.println("for give");
                break;
            }
            case 'C':
            {
                System.out.println("for tell");
                break;
            }
            case 'D':
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
