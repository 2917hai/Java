public class Stringbuffer {
    public static void main(String[] args) {
       String str= "Umesh Kumar Yadav";
       StringBuffer sb = new StringBuffer(str);
         System.out.println("Original String: " + sb);
         String st=sb.reverse().toString();
         System.out.println("Reversed String: " + st);
         String s1= st.toString();
         System.out.println(s1);
         String s2=s1.valueOf(s1);
         System.out.println("String from StringBuffer: " + s2);



         // append method in String 


            StringBuffer sb1 = new StringBuffer("A1B2C3D4");
            StringBuffer sb4=new StringBuffer();
            StringBuffer sb3 = new StringBuffer();
             for(int i=0; i<sb1.length(); i++)
             {
                char ch =sb1.charAt(i);
                if(ch>='A' && ch<='Z')
                {
                    sb4.append(ch);
                }
                else if(ch<='9' && ch>='0')
                {
                    sb3.append(ch);
                }
             }
                 
            System.out.println("Alphabets :"+sb4);
            System.out.println("Number :"+sb3);




            // delete method in StringBuffer

            StringBuffer sb5 = new StringBuffer("ABCDEFGH");
            for(int i=0; i<sb5.length(); i++)
            {
                if(sb5.charAt(i)=='A' || sb5.charAt(i)=='E' || sb5.charAt(i)=='I' || sb5.charAt(i)=='O' || sb5.charAt(i)=='U')
                {
                    sb5.deleteCharAt(i);
                    
                }
            }
            System.out.println("String after deletion of vowels: " + sb5);



            // insert method in StringBuffer

            StringBuffer sb6 = new StringBuffer("Hello World");
            sb6.insert(5, " Java");   // Inserting " Java" at index 5
            // The StringBuffer now contains "Hello Java World"
            System.out.println("String after insertion: " + sb6);


            // replace method in StringBuffer
            StringBuffer sb7 = new StringBuffer("Hello World");
            sb7.replace(6, 7, "Java"); // Replacing "World" with "Java"
            System.out.println(sb7);

            // setCharAt method in StringBuffer
            StringBuffer sb8 = new StringBuffer("Hello World");
            sb8.setCharAt(6, 'J'); // Changing 'W' to 'J'
            System.out.println("String after setCharAt: " + sb8);




            // Capitalize the first letter of each word in a StringBuffer
            StringBuffer sb9 = new StringBuffer("wellcome to java programming");
            String[] words = sb9.toString().split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > 0) {
                    words[i] = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
                }
            }
            StringBuffer capitalizedString = new StringBuffer();
            for (String word : words) {
                capitalizedString.append(word).append(" ");
            }
            System.out.println("Capitalized String: " + capitalizedString.toString().trim());
            


            // toglecase method in StringBuffer

            StringBuffer sb10 = new StringBuffer("Hello World");
            for (int i = 0; i < sb10.length(); i++) {
                char ch = sb10.charAt(i);
                if (Character.isUpperCase(ch)) {
                    sb10.setCharAt(i, Character.toLowerCase(ch));
                } else if (Character.isLowerCase(ch)) {
                    sb10.setCharAt(i, Character.toUpperCase(ch));
                }
            }
            System.out.println("String after toggling case: " + sb10);
          

  //  find longest word in StringBuffer
            StringBuffer sb11 = new StringBuffer("Java is a programming language");
            String[] words1 = sb11.toString().split(" ");
            String longestWord = "";
            for (String word : words1) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            System.out.println("Longest word: " + longestWord); 

            String shortword = "";
            for(String word1:words)
            {
                if(word1.length()<shortword.length() || shortword.equals(""))
                {
                    shortword=word1;
                }

            }
            System.out.println("Shortest word: " + shortword);

// replace method in StringBuffer
            StringBuffer sb12 = new StringBuffer("Hello World");
            sb12.replace(0, 5, "Hi"); // Replacing "Hello" with "Hi"
            System.out.println("String after replace: " + sb12);

            // delete method in StringBuffer
            StringBuffer sb13 = new StringBuffer("Hello World");
            sb13.delete(5, 11); // Deleting " World"
            System.out.println("String after delete: " + sb13);


            

    }
}
