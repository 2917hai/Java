public class MaxElement {
    public static void main(String[] args) {
        int arr[]=new int[]{1,8,3,7,9,4,6,2,10};
        int max=arr[0];
        int min=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Maximum element is :"+max);
        System.out.println("Minimum element is :"+min);
    }
}
