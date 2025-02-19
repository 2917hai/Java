public class Array5 {
    public static void main(String[] args) {
        int[] arr=new int[]{12,13,4,5,8,1};
        int check=17;
        boolean  f =true;
       int small=arr[0];
       int big=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j]==check)
                {
                    System.out.print("("+arr[i]+","+arr[j]+") ");
                    f=false;
                }
            }
        }
        if(f==true)
        {
            System.out.println("pair not found");
        }

         System.out.println("Next");
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                 if(arr[i]>arr[j])
                 {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                 }
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+",");
        }

System.out.println("Next");
   
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<small)
            {
               small=arr[i];
            }
            if(arr[i]>big)
            {
               big=arr[i];
            }
            for(int j=i+1; j<arr.length; j++)
            {
              
                 if(arr[i]<arr[j])
                 {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                 }
               
            }
        }
        System.out.println("Smallest value is :"+small);
        System.out.println("Largest value is :"+big);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+",");
        }
   
     























    }
}
