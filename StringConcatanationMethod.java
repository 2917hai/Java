public class StringConcatanationMethod {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println(str1+str2); // Concatenation using + operator
        System.out.println(10+str1+20+str2); // Concatenation with numbers
        System.out.println(10+20+str2); // Concatenation with numbers and string at the end
System.out.println(10+str1+20);



// concatenation using concat() method
        String str3 = str1.concat(str2);
        System.out.println("Concatenated string using concat(): " + str3);

        // Concatenation using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(" ").append(str2);
        System.out.println("Concatenated string using StringBuilder: " + sb.toString());

        // Concatenation using StringBuffer
        StringBuffer sbf = new StringBuffer();
        sbf.append(str1).append(" ").append(str2);
        System.out.println("Concatenated string using StringBuffer: " + sbf.toString());    




        // joining multiple strings using String.join()
        String joinedString = String.join(",", str1, str2);
        System.out.println("Joined string using String.join(): " + joinedString);  // Hello,World

        // Joining with a delimiter
        String[] words = {"Java", "is", "fun"};
        String joinedWithDelimiter = String.join(" ", words);
        System.out.println("Joined string with delimiter: " + joinedWithDelimiter);  




        //subsequence of a string
        String str4 = "Hello, World!";
        String subsequence = str4.substring(0, 5); // Get substring from index 0 to 5
        System.out.println("Subsequence of the string: " + subsequence);  // Hello



        //substring with start index
        String str5 = "Hello, World!";
        String subsequenceWithStart = str5.substring(7); // Get substring from index 7 to end
        System.out.println("Subsequence with start index: " + subsequenceWithStart);  // World!
        //substring with start and end index
        String str6 = "Hello, World!";
        String subsequenceWithStartEnd = str6.substring(0, 5); // Get substring from index 0 to 5
        System.out.println("Subsequence with start and end index: " + subsequenceWithStartEnd);  // Hello
    }
}
