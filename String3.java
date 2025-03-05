public class String3 {
    static boolean bp(String str)
    {
         int cp=0;
         int sq=0;
         int cr=0;
         for(int i=0; i<str.length(); i++)
         {
             if(str.charAt(i)=='{')
             {
                 cp++;
             }
             else if(str.charAt(i)=='[')
             {
                 sq++;
             }
             else if(str.charAt(i)=='(')
             {
                 cr++;
             }
             else if(str.charAt(i)=='}')
             {
                 cp--;
             }
             else if(str.charAt(i)==']')
             {
                 sq--;
             }
             else if(str.charAt(i)==')')
             {
                 cr--;
             }
         }
      
            if(cp==0 && sq==0 && cr==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    public static void main(String[] args) {
        System.out.println("Thie is String3 class");
      String str="[{()}]";
      if(bp(str))
      {
          System.out.println("Balanced");
      }
      else
      {
          System.out.println("Not Balanced");
      }
        

    }
}
