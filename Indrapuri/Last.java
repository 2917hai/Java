import java.util.*;
public class Last {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        int sum;
        int last1;
        int last2;
        last1=no1%10;
        last2=no2%10;
        sum=last1+last2;
        System.out.println("sum :"+sum);


        int secondlast1,secondlast2;
        secondlast1=(no1/10)%10;
        secondlast2=(no2/10)%10;
        int sum2=secondlast1+secondlast2;
        System.out.println("second last sum: "+sum2);




        int thirdlast1,thirdlast2;
        thirdlast1=(no1/100)%10;
        thirdlast2=(no2/100)%10;
        int sum3=thirdlast1+thirdlast2;
        System.out.println("third last sum: "+sum3);
       


        int no3;
        System.out.println("Enter third no");
        no3=sc.nextInt();
        int l3=(no3/100)%10;
        System.out.println(l3);




        //  Ralational operator 
        // ==, !=, >, <, >=, <=
        // Logical operartor
        // &&, ||, !
        //Bitwise operator
        // &, |, ^, ~, <<, >>
        // Bitwise operators are used to perform operations on bits and binary numbers.
        // 1. & (Bitwise AND) - compares each bit of two numbers and returns 1 if both bits are 1, otherwise returns 0.
        // 2. | (Bitwise OR) - compares each bit of two numbers and returns 1 if at least one of the bits is 1, otherwise returns 0.
        // 3. ^ (Bitwise XOR) - compares each bit of two numbers and returns 1 if the bits are different, otherwise returns 0.  
        // Example: 5^3=6
        // 4. ~ (Bitwise NOT) - inverts the bits of a number.
        




        int n1=10;
        int n2=20;
        int n3=30;
        boolean r=n1<n2 && n2<n3;
        System.out.println(r);
        System.out.println();






        
    }
}
