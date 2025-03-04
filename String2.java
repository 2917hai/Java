public class String2 {
    public static void main(String[] args) { 
        System.out.println("String class");
        String obj1="Apple";          // data are store in string pool and create single object
        String obj2=new String("Orange");   //data are store in heap and create 2 object
        String obj3="Apple";               // no object create because data are store in string pool
        String obj4="Orange";        //no object create because data are also store in spring pool
        if(obj1==obj3)
        {
            System.out.println("true");

        }
         else
         {
           System.out.println("false");
         }

         if(obj2==obj4)   
         {
             System.out.println("true");
 
         }
          else
          {
            System.out.println("false");
          }
          
        obj1.replace("Apple", "Orange");// data are store in heap because we use method 
        System.out.println(obj1);//  Apple
        obj1=obj1.replace("Apple", "Orange");// data are store in heap because we use method
        System.out.println(obj1);// Orange
        char[] ch=obj1.toCharArray();
        int length=obj1.length();
        int a=0;
        int b=length-1;
        System.out.println(a+""+b);
        int mid=length/2;
        for(int i=0;i<mid;i++)
        {
            char temp=ch[a];
            ch[a]=ch[b];
            ch[b]=temp;
            a++;
            b--;
        }
        String rev=new String(ch);
        System.out.println(rev);


        /// *********************************   Palidrome   **************************************************
        String str="abcba";
        char[] pali=str.toCharArray(); 
        int length1=str.length();
        int a1=0;
        int b1=length1-1;
        int mid1=length1/2;
        boolean pli=true;
        for(int i=0;i<mid1;i++)
        {
            if(pali[a1]!=pali[b1])
            {
                pli=false;
                break;
            }
            a1++;
            b1--;
        }
        if(pli)
        {
            System.out.println("Palidrome");
        }
        else
        {
            System.out.println("Not Palidrome");
        }
       

       
        String str1="abc";
        char[] ch1=str1.toCharArray();
        int length2=str1.length();
        for(int i=0; i<length2; i++)
        {
         System.out.print((char)(ch1[i]-32));
        }

        
        
    }
}
