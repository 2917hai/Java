public class Array2 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
////////////////////////////   Sum Of Array    /////////////////////////////////////////
        int sum=0;
        for(int i:arr)
        {
           sum=sum+i;
        } 
        System.out.println(sum);
///////////////////////////////////   Reverse   ///////////////////////////////////////
        for(int i:arr)
        {
            System.out.print(arr[arr.length-i]+" ");
        }
        System.out.println();
///////////////////////////////////    Reverse    ////////////////////////////////////// 
    int start=0;
    int end =arr.length-1;
     while(start<end)
     {
        if(start!=end)
        {
            System.out.println("no");
            return;
        } 
      int temp=arr[start];
      arr[start]=arr[end];
      arr[end]=temp;
      start++;
      end--; 
      System.out.println("yes");
     }
     for(int j:arr)
     {
        System.out.print(j+" ");
     }
////////////////////////  Palidrome Number   ////////////////////////////////////////////
    }
}
