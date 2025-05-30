public class StringClassMethod {
    public static void main(String[] args) {
        // length() method
        String str1 = "Hello, World!";  
        int length = str1.length();
        System.out.println("Length of the string: " + length);

        // isEmpty() method
        String str2 = "";
        boolean isEmpty = str2.isEmpty();
        System.out.println("Is the string empty? " + isEmpty);

       

        // trim() method
        String str4 = "   Hello, World!   ";
        String trimmedStr = str4.trim(); // Remove leading and trailing spaces
        System.out.println("Trimmed string: '" + trimmedStr + "'");


        // toUpperCase() method
        String str5 = "hello";
        String upperCaseStr = str5.toUpperCase(); // Convert to uppercase
        System.out.println("Uppercase string: " + upperCaseStr);


        // toLowerCase() method
        String str6 = "HELLO";
        String lowerCaseStr = str6.toLowerCase(); // Convert to lowercase
        System.out.println("Lowercase string: " + lowerCaseStr);


        // substring() method
        String str7 = "Hello, World!";
        String subStr = str7.substring(0, 5); // Get substring from index 0 to 5
        System.out.println("Substring from index 0 to 5: " + subStr);


        


        // split() method
        String str9 = "apple,banana,orange";
        String[] fruits = str9.split(","); // Split string by comma
        System.out.println("Fruits after split:");


        for (String fruit : fruits) {
            System.out.println(fruit);
        }


/////////////////   searching method

         // charAt() method
        String str3 = "Hello";
        char character = str3.charAt(1); // Get character at index 1
        System.out.println("Character at index 1: " + character);

        // indexOf() method
        String str10 = "Hello, World!";
        int index = str10.indexOf("World"); // Find index of "World"
        System.out.println("Index of 'World': " + index);


        
        // lastIndexOf() method
        String str26 = "Hello, World! Hello!";
        int lastIndex = str26.lastIndexOf("Hello"); // Find the last index of "Hello"   
        System.out.println("Last index of 'Hello': " + lastIndex);



        // firstIndexOf() method
        String str30 = "Hello, World! Hello!";
        int firstIndex = str30.indexOf("Hello"); // Find the first index of "Hello"
        System.out.println("First index of 'Hello': " + firstIndex);


        // startsWith() method
        String str13 = "Hello, World!";
        boolean startsWithHello = str13.startsWith("Hello"); // Check if string starts with "Hello" 
        System.out.println("Does the string start with 'Hello'? " + startsWithHello);


        // endsWith() method
        String str14 = "Hello, World!";
        boolean endsWithWorld = str14.endsWith("World!"); // Check if string ends with "World!"
        System.out.println("Does the string end with 'World!'? " + endsWithWorld);


        // contains() method
        String str15 = "Hello, World!";
        boolean containsWorld = str15.contains("World"); // Check if string contains "World"
        System.out.println("Does the string contain 'World'? " + containsWorld);







        //concat() method
        String str11 = "Hello";
        String str12 = " World!";
        String concatenatedStr = str11.concat(str12); // Concatenate two strings

        System.out.println("Concatenated string: " + concatenatedStr);




       
        // valueOf() method
        int number = 123;
        String str16 = String.valueOf(number); // Convert int to String
        System.out.println("String representation of number: " + str16);


        // format() method
        String name = "Alice";
        int age = 30;
        String formattedStr = String.format("Name: %s, Age: %d", name, age); // Format string with variables
        System.out.println("Formatted string: " + formattedStr);


        // compareTo() method
        String str17 = "apple";
        String str18 = "banana";
        int comparisonResult = str17.compareTo(str18); // Compare two strings lexicographically 
        if (comparisonResult < 0) {
            System.out.println(str17 + " is less than " + str18);
        } else if (comparisonResult > 0) {
            System.out.println(str17 + " is greater than " + str18);
        } else {
            System.out.println(str17 + " is equal to " + str18);
        }


        // equals() method
        String str19 = "Hello";
        String str20 = "Hello";
        boolean isEqual = str19.equals(str20); // Check if two strings are equal
        System.out.println("Are the strings equal? " + isEqual);


        // equalsIgnoreCase() method
        String str21 = "hello";
        String str22 = "HELLO";
        boolean isEqualIgnoreCase = str21.equalsIgnoreCase(str22); // Check if two strings are equal ignoring case
        System.out.println("Are the strings equal ignoring case? " + isEqualIgnoreCase);


        // toCharArray() method
        String str23 = "Hello";
        char[] charArray = str23.toCharArray(); // Convert string to character array
        System.out.println("Character array from string:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();




        //compareToIgnoreCase() method
        String str24 = "apple";
        String str25 = "Banana";
        int comparisonIgnoreCaseResult = str24.compareToIgnoreCase(str25); // Compare two strings lexicographically ignoring case
        if (comparisonIgnoreCaseResult < 0) {
            System.out.println(str24 + " is less than " + str25 + " (ignoring case)");
        } else if (comparisonIgnoreCaseResult > 0) {
            System.out.println(str24 + " is greater than " + str25 + " (ignoring case)");
        } else {
            System.out.println(str24 + " is equal to " + str25 + " (ignoring case)");
        }







        // replace() method      we can not add regular expression 
        //                             in replace() method
        String str8 = "Hello, World!";
        String replacedStr = str8.replace("World", "Java"); // Replace "World" with "Java"
        System.out.println("Replaced string: " + replacedStr);



        // replaceFirst() method
        String str27 = "Hello, World! Hello!";
        String replacedFirstStr = str27.replaceFirst("Hello", "Hi"); // Replace first occurrence of "Hello" with "Hi"
        System.out.println("String after replaceFirst: " + replacedFirstStr);



        


        //replaceAll() method     we can add regular expression in                           replaceAll() method
        String str28 = "Hello, World! Hello!";
        String replacedAllStr = str28.replaceAll("Hello", "Hi"); // Replace all occurrences of "Hello" with "Hi"
        System.out.println("String after replaceAll: " + replacedAllStr);

        System.out.println(str28.replaceAll("Hello(.)", "Hi")); // Replace all occurrences of "Hello" with "Hi"

        System.out.println(str28.replaceAll("Hello(.)", "Hi$1")); // Replace all occurrences of "Hello" with "Hi" and keep the next character

        System.out.println(str28.replaceAll("Hello(.*)", "Hi")); // replace ke bad sbko delete kr dega



// subsequence() method
        String str29 = "Hello, World!";
        CharSequence subSeq = str29.subSequence(0, 5); // Get subsequence from index 0 to 5
        System.out.println("Subsequence from index 0 to 5: " + subSeq);



    }
}
