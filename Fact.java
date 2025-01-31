public class Fact {
    
    public static void main(String[] args) {
        int fact=1;
        int i=1;
        do {
            fact=fact*i;
            i++;
        } while (i<=5);
        System.out.println(fact);

        int no=7;
        int check=0;
        for(int j=1; j<no; j++)
        {
            if(no%j==0)
            {
              check=check+j;
            }
        }
        if (no==check) {
            System.out.println("No is perfect");
        }
        else
        {
            System.out.println("not a perfect ");
        }
    }
}
