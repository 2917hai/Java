class One
{
    void show()
    {
        System.out.println("abc");
    }
}
public class SingleInheritance extends One {
    void show1()
    {
        System.out.println("mno");
    }
    public static void main(String[] args) {
    One obj=new One();
    obj.show();
    
    One obj1=new SingleInheritance();
    obj1.show();
    

    


        
        
    }
}

/*
 * we call main method in any class 
 * but compile only Public/ file name class only 
 * class a
 * {
 * 
 * }
 * 
 * 
 */

// is-A relationship inheritance    tight coupling 
// Has-A relationship  assosiation   loose coupling


/*
 * 
 * Polymorphism = many form of function/object/operator
 * function= method overloading/method overridding 
 * object= polymorphism 
 * operator overloading
 * 
 * 
 * polymorphism =run time(dynamic) method overriding /compile time (static)method overloading
 * 
 * same class / same name but different parameter 
 * 
 * java do not allowed method overloading using return type
 * {
 * void show()
 * int show()
 * }
 * 
 * {
 * void show()
 * void show(int a)
 * }
 * 
 * {
 * void show()
 * void show(int a)
 * void show(int a, int b);
 * }
 * 
 * 
 * 
 * Run time polymorphism
 * method overridding 
 * 
 * 
 * Different class with same method 
 * 
 * 
 * 
 */
