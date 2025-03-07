public class Substring {
    public static void main(String[] args) {
    // substring method
    String str1 = "Hello World";
    String str2 = "Hello Wold";
    char[] arr1=str1.toCharArray();
    char[] arr2=str2.toCharArray();
    int n=arr1.length;
    int m=arr2.length;
    int i=0;
    int j=0;
    while(i<n && j<m){
        if(arr1[i]==arr2[j]){
            i++;
            j++;
        }
        else{
            i=i-j+1;
            j=0;
        }
        if(j==m){
            System.out.println("Substring found at index ");
            break;
        }



    }
    if(j!=m){
        System.out.println("Substring not found");
    }

}
}
