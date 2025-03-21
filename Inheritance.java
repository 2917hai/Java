class One
{
    int a;
    One(int a)
    {
        this.a=a;
        System.out.println(a);
    }
    One(One obj)
    {
      this.a=obj.a;
      System.out.println(a);
    }
    void display()
    {
        System.out.println(a);
    }
}
public class Inheritance {
    public static void main(String[] args) {
    One obj=new One(10);
    One obj1=new One(obj);
    obj.display();
    obj1.display();
    obj.a=20;
    obj.display();
    obj1.display();
    }
}