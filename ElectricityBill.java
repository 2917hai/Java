import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        System.out.println("enter your meter reading");
        Scanner sc=new Scanner(System.in);
        int price=0;
        int read;
        read=sc.nextInt();
        if(read<=100)
        {
            System.out.println("no charge");
        }
        else if (read>100 && read<200) {

            price=(read-100)*5;
            System.out.println(price);
        }
        else if (read>=200) {

            price=(read-200)*20+500;
            System.out.println(price);
        }
    }
    
}
