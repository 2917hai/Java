import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int no1, no2;
        System.out.println("enter value of no1 and no2");
        no1=sc.nextInt();
        no2=sc.nextInt();
        System.out.println("before swaping");
        System.out.println("no1=:"+no1+" no2=: "+no2);
        int temp;
        temp=no1;
        no1=no2;
        no2=temp;
        System.out.println("after swaping");
        System.out.println("no1:"+no1+"no2: "+no2);

    }
}
