import java.util.*;
public class Switch5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String choice;
        System.out.println("1) Veg \n2) Fruits");
        System.out.println("Enter your choice");
        choice=sc.nextLine();
        switch (choice) {
            case "Veg":
                {
                System.out.println("you selected veg option");
                System.out.println("1) Potato \n2) Tomato\n 3) Onion\n 4) Eggplant ");
                String choice1;
                choice1=sc.nextLine();
                switch (choice1) {
                    case "Potato":
                    {
                        System.out.println("You have selected potato");
                        break;
                    }
                    case "Tomato":
                    {
                        System.out.println("You have selected Tomato");
                        break;
                    }
                    case "Onion":
                    {
                        System.out.println("You have selected Onion");
                        break;
                    }
                    case "Eggplant":
                    {
                        System.out.println("You have selected Eggplant");
                        break;
                    }
                    default:
                    {
                        System.out.println("you have entered invalid input ");
                        break;
                    } 
                }
                    break;
                }
              case "Fruits":
                {
                System.out.println("you selected Fruits option");
                System.out.println("1) Mango\n 2) Apple\n 3) Banana\n 4) Graps ");
                String choice2;
                choice2=sc.nextLine();
                switch (choice2) {
                    case "Mango":
                    {
                        System.out.println("You have selected Mango");
                        break;
                    }
                    case "Apple":
                    {
                        System.out.println("You have selected Apple");
                        break;
                    }
                    case "Banana":
                    {
                        System.out.println("You have selected Banana");
                        break;
                    }
                    case "Graps":
                    {
                        System.out.println("You have selected Graps");
                        break;
                    }
                    default:
                    {
                        System.out.println("you have entered invalid input ");
                        break;
                    }
                       
                }
                    
                    break;
                }
        
            default:
            {
                System.out.println("invalid input ");
                break;
            }
               
        }
    }
}
