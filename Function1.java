public class Function1 {




static void dupli(int arr[],int s)
{
    for(int i=0; i<s; i++)
    {
        boolean t=false;
        for(int j=i+1; j<s; j++)
        {
            if(arr[i]==arr[j])
            {
               t=true;
               arr[j]=-1;

            }
            
        }
        if(t && arr[i]!=-1)
        {
            System.out.println(arr[i]+" ");
        }
        
    }

   
}
    public static void main(String[] args) {
        System.out.println("===========================    Second function Class  ==================================");
       int[] arr=new int[]{1,2,3,1,2,4,2,2};
       int s=arr.length;
       dupli(arr, s);
    }
}
