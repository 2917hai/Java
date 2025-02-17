import java.util.*;
public class Array4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Array ");
        int[] arr=new int[8];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
          int count=0;
          int min=arr[0];
          for(int i=0; i<arr.length; i++)
          {
            if(arr[i]<min)
            {
                min=arr[i];
            }
          }
          int check=min-1;
           for(int i=0; i<arr.length; i++)
           {
             boolean duplicate=false;
             for(int j=i+1; j<arr.length; j++)
             {
                 if(arr[i]==arr[j] && arr[i]!=check)
                 {
                     arr[j]=check;
                     duplicate=true;
                     count++;
                 }
             }
             if(arr[i]!=check && duplicate)
             {
               System.out.print(arr[i]);
             }
           }
           System.out.println("\nNO of duplicate value is :"+count);

           //       Move all zero in right           
           int k=0;
           for(int i=0; i<arr.length; i++)
           {
            if(arr[i]!=0)
            {
                arr[k]=arr[i];
                k++;
            }
         
           }
           for(int i=k; i<arr.length; i++)
           {
            arr[i]=0;
           }

           for(int i=0; i<arr.length; i++)
           {
            System.out.print(arr[i]);
           }
           
         }
}
