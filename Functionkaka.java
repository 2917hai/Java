public class Functionkaka {
     public int add(int a, int b)
    {
        int c=a+b;
        return c;
    }
    public int sub(int a, int b)
    {
        int c=a-b;
        return c;
    }
    public int mult(int a, int b)
    {
        int c=a*b;
        return c;
    }
    public int div(int a,int b)
    {
        int c=a/b;
        return c;
    }
    public static void main(String[] args) {
        int a=90;
        int b=20;
        Functionkaka f=new Functionkaka();
         int result=f.add(a,b);
         System.out.println(result);
            int result1=f.sub(a,b);
            System.out.println(result1);
            int result2=f.mult(a, b);
            System.out.println(result2);
            int result3=f.div(a, b);
            System.out.println(result3);
    }
    
}

