public class Diamond {
    public static void main(String[] args) {
        int a=0;
        for(int i=1; i<10; i++)
        {
            a=(i<=5)?++a:--a;
            for(int j=1; j<10; j++)
            {
                if(j>=6-a && j<=4+a)
                {
                    System.out.print("*");
                }  
                else
                {
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }


        System.out.println();



        int no=1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(j<=i)
                {
                    System.out.print(no+"   ");
                    no++;
                }   
            }
            System.out.println();
        }



        System.out.println();


        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(j<=i)
                {
                    System.out.print(i+"   ");
                   
                }   
            }
            System.out.println();
        }


        System.out.println();




        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(j<=i)
                {
                    System.out.print(j+"   ");
                   
                }   
            }
            System.out.println();
        }



        System.out.println();


        int no1=1;
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(j>=i)
                {
                    System.out.print(no1+"   ");
                    no1++;
                }   
            }
            System.out.println();
        }



        System.out.println();


        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(j>=i)
                {
                    System.out.print(i+"   ");
                   
                }   
            }
            System.out.println();
        }



        

        System.out.println();

        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(j>=i)
                {
                    System.out.print(j+"   ");
                   
                }   
            }
            System.out.println();
        }


        /////////////////////////////////////////////////////
        /// 
        ///  System.out.println();
        /// 
        /// 
        char um='A';
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(j<=i)
                {
                    System.out.print(um+"   ");
                    um++;
                   
                }   
            }
            System.out.println();
        }


        System.out.println();


        for(int i=1; i<=5; i++)
        {
            char um1='A';
            for(int j=1; j<=5; j++)
            {
               
                if(j<=i)
                {
                    System.out.print(um1+"   ");
                    um1++;
                   
                }   
            }
            System.out.println();
        }


        char um3='A';
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                if(j>=i)
                {
                    System.out.print(um3+"   ");
                    um3++;
                   
                }   
            }
            System.out.println();
        }


        System.out.println();

        char um4='A';
        for(int i=1; i<=5; i++)
        {
          
            for(int j=1; j<=5; j++)
            {
               
                if(j<=i)
                {
                    System.out.print(um4+"   ");
                    um4++;
                   
                }   
            }
            System.out.println();
        }


        char um5='A';
        for(int i=1; i<=5; i++)
        {
          
            for(int j=1; j<=5; j++)
            {
               
                if(j>=i)
                {
                    System.out.print(um5+"   ");
                    um5++;
                   
                }   
            }
            System.out.println();
        }

       
    }
}
