/*
 * String is non-primitive data type 
 * String is a class 
 * 
 * String name="umesh " Or
 * String name=new String("Umesh")
 * char name[]={'U','M','E','S','H'}
 */
public class String1 {
    public static void main(String[] args) {
        System.out.println("String Class ");
        String name="Umesh";
        String name1=new String("Umesh");
        char name2[]={'U','M','E','S','H'};
        char name4[]={'U','M','E','S','H'};
        String obj=new String(name4);
        
        System.out.println(name);       //  First
        System.out.println(name1);      // Second
        System.out.println(name2);      // Third
        for(char name3:name2)
        {
          System.out.print(name3);
        }
        System.out.println();
        System.out.println(name4);


        


    }
}
