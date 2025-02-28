/*
 * String is non-primitive data type 
 * String is a class 
 * String are immutable that means we can not change the value of String 
 * 
 * String name="umesh " Or        data are store in string pool
 * String name=new String("Umesh")     data store in heap memory while we using new keyword  by default heap me hota hai
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
