public class StringComparisionMethod {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        if(str1.equals(str2)) {
            System.out.println("str1 is equal to str2 using equals()");
        } else {
            System.out.println("str1 is not equal to str2 using equals()");
        }


        String str3 = "Hello";
        String str4 = "hello";
        if(str3.equalsIgnoreCase(str4)) {
            System.out.println("str3 is equal to str4 using equalsIgnoreCase()");
        } else {
            System.out.println("str3 is not equal to str4 using equalsIgnoreCase()");
        }


// compareTo() method compares two strings lexicographically.
// firstly it convert both String into decimal value and then compare them.
// if coparison is less than 0 then str1 is less than str2
// if comparison is greater than 0 then str1 is greater than str2
// if comparison is equal to 0 then str1 is equal to str2
        // compareTo() method

        if(str1.compareTo(str2) == 0) {
            System.out.println("str1 is equal to str2 using compareTo()");
        } else {
            System.out.println("str1 is not equal to str2 using compareTo()");
        }

        if(str3.compareToIgnoreCase(str4) == 0) {
            System.out.println("str3 is equal to str4 using compareToIgnoreCase()");
        } else {
            System.out.println("str3 is not equal to str4 using compareToIgnoreCase()");
        }


    }
}
