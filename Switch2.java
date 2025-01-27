import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        String choice;
        System.out.println("One) for ask   Two) for give  Three) for tell  Four) Exit");
        System.out.println("plese select the correct option");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextLine();
        switch (choice) {
            case "One":
                {
                    System.out.println("for ask");
                    break;
                }
            case "Two":
            {
                System.out.println("for give");
                break;
            }
            case "Three":
            {
                System.out.println("for tell");
                break;
            }
            case "Four":
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
