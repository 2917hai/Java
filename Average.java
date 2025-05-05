import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    for(int i=0; i<arr.length; i++)      
    {
        System.out.println("Enter the value of "+i+" index: ");
        arr[i]=sc.nextInt();
    }
    int sum=0;
    int digit=0;
    for(int i=0; i<arr.length; i++)
    {
        if(arr[i]%2==0)  // if even number then only add in sum
        {
            sum+=arr[i];  
            digit++;  
        }
          
    }
    int avg=sum/digit;
    System.out.println("Average is: "+avg);
}
}