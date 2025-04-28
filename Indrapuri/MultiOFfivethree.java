public class MultiOFfivethree {
    public static void main(String[] args) {
        int no=10;
       while (no>=10 && no<=60) {
            if (no % 5 == 0 ) {
                System.out.println("Multiple of 5 : " + no);
          
            } 
            else if (no % 3 == 0) {
                System.out.println("Multiple of 3: " + no);
            }
            else if (no%5==0 && no%3==0) {
                System.out.println("Multiple of 5 and 3: " + no);
            } 
          
            no++;
        }
        
       }
    }

