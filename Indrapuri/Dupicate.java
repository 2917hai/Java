import java.util.*;
public class Dupicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.println("enter the size of arr");
        s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("enter the data of arrr");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("HEre your arr data");
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate found: "+arr[i]);
                    arr[i]=0;
                }
            }
        }
        for(int i=0; i<arr.length; i++)
        {
           
            System.out.println(arr[i]);
        }

        
      
        
    }
}
