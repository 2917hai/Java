import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s;
        System.out.println("enter the size of array");
        s=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++)
        {
            int freq=1;
            if(arr[i]==-1)
            {
                continue;
            }
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j] && arr[i]!=-1)
                {
                    arr[j]=-1;
                    freq++;
                   

                }
              
            }
            System.out.println(arr[i]+"frequncy :"+freq);
        }
    }
}
