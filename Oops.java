// class One
// {
//     int a;
//     One(int a)
//     {
//         this.a=a;
//         System.out.println(a);
//     }
//     One(One obj)
//     {
//       this.a=obj.a;
//       System.out.println(a);
//     }
//     void display()
//     {
//         System.out.println(a);
//     }
// }
// public class Inheritance {
//     public static void main(String[] args) {
//     One obj=new One(10);
//     One obj1=new One(obj);
//     obj.display();
//     obj1.display();
//     obj.a=20;
//     obj.display();
//     obj1.display();
//     }
// }










//////////////////////////////////////////////////////////////////////////////////////////////////////
// class One
// {
//     int arr[];
//     One(int arr[])
//     {
//         this.arr=new int[arr.length];
//         for(int i=0; i<arr.length; i++)
//         {
//             this.arr[i]=arr[i];
//         }
      
//     }
//     One(One obj)
//     {
//         this.arr=new int[obj.arr.length];
//         for(int i=0; i<arr.length; i++)
//         {
//             this.arr[i]=arr[i];
//         }
//     }
//     void display()
//     {
//        for(int i:arr)
//        {
//         System.out.println(i);
//        }
//     }
// }
// public class Inheritance {
//     public static void main(String[] args) {
//         int arr[]={10,20,30,40};
//     One obj=new One(arr);
//     One obj1=new One(obj.arr);
//     obj.display();
//     obj1.display();
//     obj.arr[0]=20;
//     obj.display();
//     obj1.display();
//     }
// }










////////////////////////////////////////////////////////////////////////////////////////////////////////////
class One
{
    int arr[];
    One(int arr[])
    {
       this.arr=arr;
      
    }
    One(One obj)
    {
       this.arr=obj.arr;
    }
    void display()
    {
       for(int i:arr)
       {
        System.out.print(i+" ");
       }
    }
}
public class Oops {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
    One obj=new One(arr);
    One obj1=new One(obj.arr);
    obj.display();
    System.out.println();
    obj1.display();
    System.out.println();
    obj.arr[0]=80;
    obj.display();
    System.out.println();
    obj1.display();
    }
}