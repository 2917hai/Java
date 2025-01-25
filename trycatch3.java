public class trycatch3 {
    public static void main(String[]args)
    {
        System.out .println("1");
    try
    {
        System.out .println(100/0);
        System.out.println("a");
        System.out.println("b");
    }
    catch(Exception e)
    {
        System.out .println("exception will be handle ");
    
    }
    System.out .println("thanks for handeling event ");
    System.out.println();

    }
}


