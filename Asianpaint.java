import java.util.*;
public class Asianpaint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Two color");
        String color1;
        String color2;
        color1=sc.nextLine();
        color2=sc.nextLine();
        String color=color1+color2;
        if(color.equals("redblack"))      // color1 and color2 is the object of String class copare only memory location but string are store other memory location there for it does not compare  
        {                                          // we can use equlas  for compare the value of object
            System.out.println("right  "+color);
        }
        else
        {
            System.out.println("not");
        }
    }
}
