public class trycatch2 {
    public static void main(String[]args)
    {
        System.out .println("1");
    try
    {
        System.out.println("ohk");
        System.out .println(100/0);
    }
    catch(Exception e)
    {
        System.out .println("exception will be handle ");
    
    }
    System.out .println("thanks for handeling event ");

    }
}


