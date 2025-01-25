public class PalidromNumberU {
    public static void main(String[]args)
    {
        int no=12321;
        int temp=no;
        int rev=0;
        int rem;
        while(temp!=0)
        {
            rem=temp%10;
            rev=10*rev+rem;
            temp=temp/10;
        }
        if(rev==no)
        {
            System.out.println(no+ "number is palidrom");
        }
        else
        {
            System.out.println(no+ "number are not palidrom");
        }
    }
}
