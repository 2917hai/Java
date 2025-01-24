import java.util.*;
public class Mapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int path;
        System.out.println("1, 2, 3, 4");
        System.out.println("enter your path");
        path=sc.nextInt();
        if(path==1)
        {
            System.out.println("give next path");
            System.out.println("2, 3, 4");
            path=sc.nextInt();
            if (path==2) {
                System.out.println("3,4");
                System.out.println("enter next path");
                path=sc.nextInt();
                if (path==4) {
                    System.out.println("reached");
                }
                else if(path==3)
                {
                    System.out.println("4");
                    System.out.println("enter next path");
                    path=sc.nextInt();
                    if ((path==4)) {
                        System.out.println("reached");
                    }
                    else
                    {
                        System.out.println("wrong path");
                    }
                }
                else
                {
                    System.out.println("wrong path");
                }
            }
            else if (path==3) {
                System.out.println("2,4");
                path=sc.nextInt();
                if (path==4) {
                    System.out.println("reached");
                    
                }
                else if (path==2) {
                    System.out.println("4");
                    System.out.println("select next pathe");
                    System.out.println("4");
                    path=sc.nextInt();
                    if(path==4)
                    {
                        System.out.println("reached");
                    }
                    else
                    {
                        System.out.println("wrong path");
                    }
                }
                else
                {
                    System.out.println("wront path");
                }
            }
            else if (path==4) {
                System.out.println("reached");
                
            }
            else
            {
                System.out.println("wrong path");
            }
        }
        else{
            System.out.println("wrong path");
        }
    }
}
