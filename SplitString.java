import java.util.*;
public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SplitString");
       String str= "Umesh,Kumar,Yadav";
       String[] arr=str.split(",");
       int length1=arr.length;
       for(int i=0; i<length1; i++)
       {
        System.out.println(arr[i]);
       }
       for(String parts : arr)
       {
        System.out.print(parts+" ");
       }



       String no="1,2,3,4,5";
         String[] arr1=no.split(",");
         int length=arr1.length;
         for(int i=0; i<length; i++)
         {
            System.out.println(arr1[i]);
         }
      
         for(String parts : arr1)
            {
            System.out.print(parts+" ");;
            }


            String str2= "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has  .";
            String arr5[]=str2.split("e");
            for(String parts : arr5)
            {
                System.out.print(parts+" ");
            }

            String str4=" Umesh ";
            System.out.println(str4.trim());


            int arr6[][]=new int[3][4];
            for(int i=0; i<arr6.length; i++)
            {
                for(int j=0; j<arr6[i].length; j++)
                {
                    arr6[i][j]=sc.nextInt();
                }
            }

            for(int i=0; i<arr6.length; i++)
            {
                for(int j=0; j<arr6[i].length; j++)
                {
                    System.out.print(arr6[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("\n");
            for(int arr10[]:arr6)
            {
                for(int arr11:arr10)
                {
                    System.out.print(arr11+" ");
                }
                System.out.println();
            }


System.out.println();
            String str30="Umesh";
            char arr20[]=str30.toCharArray();
            for(char a:arr20)
            {
                System.out.println(a);
            }
            int count=0;
            String str31="wellcome";
            char arr21[]=str31.toCharArray();
            for(char a:arr21)
            {
                if(a=='a'|| a=='e' || a=='i' || a=='o' || a=='u')
                {
                    count++;
                }
            }
            System.out.println("Number of vowel is "+count);
                               
    }
}
