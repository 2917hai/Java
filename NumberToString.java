import java.util.*;
public class NumberToString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no;
        System.out.println("Enter a number");
        no=sc.nextInt();
        int rem;
        int n=0;
        int count=0;
        int no1=no;
        while (no1>0) {
            rem=no1%10;
            n=(n*10)+rem;
            no1=no1/10;
            count++;
        }
        System.out.println(n);
        int rem1;
        while (count!=0) {
            rem1=n%10;
            switch (rem1) {
                    case 1:
                    System.out.print("one");
                    break;
                    case 2:
                    System.out.print("two");
                    break;
                    case 3:
                    System.out.print("Three");
                    break;
                    case 4:
                    System.out.print("Four");
                    break;
                    case 5:
                    System.out.print("five");
                    break;
                    case 6:
                    System.out.print("six");
                    break;
                    case 7:
                    System.out.print("seven");
                    break;
                    case 8:
                    System.out.print("Eight");
                    break;
                    case 9:
                    System.out.print("nine");
                    break;
                    case 0:
                    System.out.print("Zero");
                    break;
                   default:
                   System.out.print("no");
                   break;
            }
            n=n/10; 
            count--;
        }
    }
}
