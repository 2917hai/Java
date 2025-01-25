import java.util.*;
public class HDFC {
    public static void main(String[] args) {
        String choice;
        Scanner sc=new Scanner(System.in);
        choice=sc.nextLine();
        System.out.println("plese click bellow option");
        System.out.println("Ask Eva");
       if(choice.equals("Ask Eva"))
        {
            System.out.println("plese click bellow option");
            System.out.println("Service,  Product, ");
            choice=sc.nextLine();
            if (choice.equals("Service")) {
                System.out.println("no services available");
                
            }
            else if(choice.equals("Product"))
            {
                System.out.println("Insurance, MiniStatement,");
                choice=sc.nextLine();
                if (choice.equals("Insurance")) {
                    System.out.println("choose option");
                    System.out.println("car Insurance, Life Insurance");
                    choice=sc.nextLine();
                    if (choice.equals("car Insurance")) {
                        System.out.println("done your car Insurance");
                        
                    }
                    else if (choice.equals("life Insurance")) {
                        System.out.println("Life insurance done");
                        
                    }
                    else
                    {
                        System.out.println("incorrect option");
                    }
                    
                }
                else if (choice.equals("MiniStatement")) {
                    System.out.println("No minstatement available");
                    
                }

            }
            else
            {
                System.out.println("incorrect option");
            }
        }
    }
}
