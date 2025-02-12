/*
 * 
 * Array is Object in Java while Array is variable in C++
 * 
 */
  import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[] {1,2,3,4,5};
        System.out.println(arr[0]);
        int arr1[]=new int[5];
        for(int i=0; i<arr1.length; i++)      ///arr1.length()   its wrong because length is a property in java its not a function
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<arr1.length; i++)
        { 
            System.out.println(arr[i]);

        }




        //            For Each
        for(int i:arr)   // Arrayn is a collection
        {
            System.out.println(arr[i]);
        }
    }
}
