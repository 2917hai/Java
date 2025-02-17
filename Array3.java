import java.util.*;
public class Array3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter data of Array");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        int max=arr[0];
        System.out.println("Now And maximum value is    "+ max);

          for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("After All Process maximum value is    "+ max);
        System.out.println("Now we find second maximum value");
         int smax=arr[0];
        for(int i=1; i<arr.length; i++)
        {
           
            if (smax<max && smax>arr[i]) {
                if(arr[i]==smax)
                {
                    continue;
                }
                else
                {
                    smax=arr[i];
                }
                
            }
        }
        System.out.println("Second maximum value is "+smax);
////////////////////////////////////    Missing Number   /////////////////////////////////////////////////////

           for(int i=0; i<arr.length-1; i++)
           {
            if(arr[i+1]-arr[i]>1)
            {
                System.out.println(arr[i]+1);
            }
           }

////////////////////////////////  Multiple missing   ///////////////////////
         

           for(int i=0; i<arr.length-1; i++)
           {
            if(arr[i+1]-arr[i]>1)
            {
                for(int j=arr[i]+1; j<arr[i+1]; j++)
                System.out.println(j);
            }
           }

////////////////////////////////////    Duplicate Number   /////////////////////////////////////////////////////

           for(int i=0; i<arr.length-1; i++)
           {
             for(int j=i+1; j<arr.length; j++)
             {
                if(arr[i]==arr[j])
                {
                    System.out.print(arr[i]);
                    continue;
                }
             }
           }
    }
}
