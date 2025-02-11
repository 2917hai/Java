public class Question1 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////");
        for(int ii=1; ii<=5; ii++)
        {
            for(int jj=1; jj<=5; jj++)
            {
                if(jj<=ii)
                {
                    System.out.print("*");
                }   
            }
            System.out.println();
        }
        for(int ii=1; ii<=5; ii++)
        {
            for(int jj=1; jj<=5; jj++)
            {
                if(jj>=ii)
                {
                    System.out.print("*");
                }   
            }
            System.out.println();
        }
        for(int ii=1; ii<=5; ii++)
        {
            for(int jj=1; jj<=5; jj++)
            {
                if(jj<=5-ii)
                {
                    System.out.print(" ");
                }   
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
           
        }
        for(int ii=1; ii<=5; ii++)
        {
            for(int jj=1; jj<=5; jj++)
            {
                if(jj>=5-ii)
                {
                    System.out.print(" ");
                }   
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
           
        }



    }
}
