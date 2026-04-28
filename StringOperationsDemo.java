package mypackage;

import java.util.Arrays;

public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String text = "Java Programming";
        System.out.println("Index of 'Pro': " + text.indexOf("Pro"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (0,4): " + text.substring(0, 4));

        // 6. String Modification
        String modified = text.replace("Java", "Python");
        System.out.println("Modified String: " + modified);

        // 7. Whitespace Handling
        String str4 = "   Hello Java   ";
        System.out.println("Before trim: '" + str4 + "'");
        System.out.println("After trim: '" + str4.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");
        System.out.println("Splitted Words: " + Arrays.toString(words));

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        System.out.println("StringBuilder Output: " + sb);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email
        String email = "example@gmail.com";

        if (email.contains("@") &&
            email.startsWith("example") &&
            email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}