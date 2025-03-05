public class String4 {
    public static void main(String[] args) {
        //  anagram question 
        String str1="listen";
        String str2="silent";
        int[] arr=new int[256];
        for(int i=0; i<str1.length(); i++)
        {
            arr[str1.charAt(i)]++;
        }
        for(int i=0; i<str2.length(); i++)
        {
            arr[str2.charAt(i)]--;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
                System.out.println("Not Anagram");
                break;
            }
        }
        System.out.println("Anagram");
    }
}
