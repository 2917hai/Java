public class StringConstructor {
    public static void main(String[] args) {
        // Creating a String using the default constructor
        String str1 = new String();
        System.out.println("String using default constructor: '" + str1 + "'");

        // Creating a String using a character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str2 = new String(charArray);
        System.out.println("String from character array: '" + str2 + "'");

        // Creating a String using a byte array
        byte[] byteArray = {72, 101, 108, 108, 111};
        String str3 = new String(byteArray);
        System.out.println("String from byte array: '" + str3 + "'");

        // Creating a String using another String
        String str4 = new String(str2);
        System.out.println("String from another String: '" + str4 + "'");

        // using StringBuilder to create a String
        StringBuilder sb = new StringBuilder("Umesh");
        String str5 = new String(sb);
        System.out.println("String from StringBuilder: '" + str5 + "'");

        // Stringbuilder to create a String with append
        StringBuilder sb2 = new StringBuilder("Hello");
        String str6 = new String(sb2.append(" World"));
        System.out.println("String from StringBuilder with append: '" + str6 + "'");
    }
}
