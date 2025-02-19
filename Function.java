import java.util.Scanner;

public class Function {
       void add()
        {
            int a=10;
            int b=20;
            System.out.println(a+b);
        }
        int mult()
        {
            int no1=5;
            int no2=10;
            return no1*no2;
        }
        String Name()
        {
            String name="Umesh";
            return name;
        }
        boolean name()
        {
            String Name="Umesh";
            return true;
        }
        int Add(int a, int b)
        {
          return a*b;
        }
        void Details(int no, char a, String Naam, int arr[])
        {
            Scanner sc=new Scanner(System.in);
            for(int i=0; i<arr.length; i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.print(no+"  "+a+"  "+Naam+" ");
            for(int i:arr)
            {
                System.out.print(i);
            }
        }
    public static void main(String[] args) {
        System.out.println("Function");
        Scanner sc=new Scanner(System.in);
        //Funtin should be create inside of Class
        Function obj=new Function();
        obj.add();
        System.out.println(obj.mult());
        System.out.println(obj.Name());
        obj.name();
        System.out.println( obj.Add(10, 20));
        int s;
        System.out.println("enter the size of array");
        s=sc.nextInt();
        int[] arr=new int[s];
        obj.Details(10, 'A', "Umesh", arr);
    }
}
















//                    Static     

// public class Function {
//    static void add()
//      {
//          int a=10;
//          int b=20;
//          System.out.println(a+b);
//      }
//  public static void main(String[] args) {
//      System.out.println("Function");
//      //Funtin should be create inside of Class
    
//      add();
//  }
// }