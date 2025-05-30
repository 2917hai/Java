public class StringBuffer1 {
    /*
     * If the data can not change or change one or two times then we use String 
     * If the data can change many times then we use StringBuffer or If the data id constantly and frequently changing then we use StringBuilder
     * 
     * 
     * 
     * StringBUffer is mutable class
     * StringBuffer is synchronized
     * StringBuffer is thread safe
     * StringBuffer is slower than StringBuilder
     */
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Hello");
        System.out.println(sb.capacity()); // Default capacity is 16, but it will increase as needed
        sb.append(" World");
        System.out.println(sb);

        System.out.println(sb.length()); // Length of the current string in the StringBuffer
        
        System.out.println(sb.charAt(0)); // Accessing the first character of the StringBuffer
        sb.insert(5, " Beautiful"); // Inserting " Beautiful" at index 5    


        System.out.println(sb.delete(1, 5)); // Deleting characters from index 1 to 5

        System.out.println(sb.deleteCharAt(0)); // Deleting the character at index 0

        System.out.println(sb.reverse()); // Reversing the StringBuffer content

        System.out.println(sb.toString()); // Converting StringBuffer to String

        System.out.println(sb.insert(1, "Umesh")); // Inserting "Umesh" at index 1

        System.out.println(sb.replace(1, 6, "Umesh Kumar")); // Replacing characters from index 1 to 6 with "Umesh Kumar"   

        System.out.println(sb.subSequence(1, 3)); // give string from index 1 to index 3

        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        

        sb.setCharAt(0, 'M');
        System.out.println(sb);


        sb.setLength(10); // Setting the length of the StringBuffer to 10
        System.out.println(sb); // Output will be truncated to the first 10 characters

        sb.trimToSize(); // remove extra capacity
        System.out.println(sb.capacity()); // Output will show the current capacity after trimming

        
    }
}
