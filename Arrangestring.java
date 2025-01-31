import java.util.*;
public class Arrangestring {
    public static void main(String[] args) {
        System.out.println("Enter three String");
        Scanner sc=new Scanner(System.in);
        String str1, str2, str3;
        str1=sc.nextLine();
        str2=sc.nextLine();
        str3=sc.nextLine();
        if (str1.compareTo(str2)>0) {
            String temp=str1;
            str1=str2;
            str2=temp;
        }
        if(str2.compareTo(str3)>0) 
        {
            String temp1=str2;
            str2=str3;
            str3=temp1;
        }
        System.out.println(str1+""+str2+""+str3);
        int no;
        no=sc.nextInt();
       int res=no>10 ? (no+10):(no+20);
       {
             System.out.println(res);
       }
      String check=( no>10) ? "good morning" : "good evening";
      System.out.println(check);
    
    }
}
