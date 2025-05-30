public class StringConversionMethod {
    public static void main(String[] args) {
        

        // toLowerCase() method
        String str1 = "Hello World!";
        String lowerCaseStr = str1.toLowerCase(); // Convert to lowercase
        System.out.println("Lowercase string: " + lowerCaseStr);



        // toUpperCase() method
        String Uppercase=str1.toUpperCase(); // Convert to uppercase
        System.out.println("Uppercase string: " + Uppercase);



        // valueOf() method
        int number = 123;
        String numberStr = String.valueOf(number); // Convert int to String
        System.out.println("String representation of number: " + numberStr);



        // toCharArray() method
        char[] charArray = str1.toCharArray(); // Convert String to char array
        System.out.print("Character array from string: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }



        // toString() method
        String str2 = new String("Hello World!"); // Create a new String object
        String str2ToString = str2.toString(); // Convert String to String (redundant but demonstrates the method)
        System.out.println("\nString from toString(): " + str2ToString);



        // parsInt() method
        String str3 = "456";
        int parsedInt = Integer.parseInt(str3); // Convert String to int
        System.out.println("Parsed integer from string: " + parsedInt);


        // parseDouble() method
        String str4 = "3.14";
        double parsedDouble = Double.parseDouble(str4); // Convert String to double
        System.out.println("Parsed double from string: " + parsedDouble);



        // // parseBoolean() method
        String str5 = "true";
        boolean parsedBoolean = Boolean.parseBoolean(str5); // Convert String to boolean
        System.out.println("Parsed boolean from string: " + parsedBoolean);


        
      
    }
}
