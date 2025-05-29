import java.util.*;
public class TwoD_Array {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int arr[][]=new int[2][3];
      int arr1[]=new int[]{1,2,3,4};
      System.out.println(arr.length);
      System.out.println(arr[0].length);
      for(int i=0; i<arr.length; i++)
      {
        for(int j=0; j<arr[i].length; j++)
        {
            arr[i][j]=sc.nextInt();
        }
      }   
      for(int i=0; i<arr.length; i++)
      {
        for(int j=0; j<arr[i].length; j++)
        {
            System.out.print(arr[i][j]+"\t");
        }
        System.out.println();
      }   
      for(int[] data:arr)
      {
        for(int data1:data)
        System.out.print(data1);

      }
      System.out.println();
    }
}