public class PalidromA {
    public static void main(String[]args)
    {
        int no=121;
        int temp=no;
        int rev=0;
        int rem;
        while(temp!=0)
        {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(no==rev)
        {
            System.out.println("number is palodrom");
        }
        else{
            System.out.println("no palidrom number");
        }
    }
}   




