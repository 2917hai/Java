import java.util.Scanner;
public class BubbleSort {
    public static void main (String []args)
    {
Scanner s= new Scanner(System.in);
System.out.println("enter the size of array");
int size=s.nextInt();
int arr[]=new int[size];

    for(int i=0; i<=size; i++)
    {
        System.out.println("enter the number"+(i+1));
       arr[i]=s.nextInt();
    }
}

    }

