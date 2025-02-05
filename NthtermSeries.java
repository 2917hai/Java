public class NthtermSeries {
  public static void main(String[] args) {
    int n=10;
    int a=1;
    int next=a;
    for(int i=1; i<=n; i++)
    {
       System.out.print(next+"\t");
       next=1+(next*10);
       
    }
  }
}
