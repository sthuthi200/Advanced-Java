
package mypackage;

import java.util.Arrays;

public class StringOperations3A {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String s1 = "Hello";
        String s2 = new String("World");

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // 2. Length and Character Access
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 2 in s1: " + s1.charAt(2));

        // 3. String Comparison
        String s3 = "hello";
        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));

        // 4. String Searching
        String text = "Java Programming Language";
        System.out.println("Index of 'Pro': " + text.indexOf("Pro"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (5, 16): " + text.substring(5, 16));

        // 6. String Modification
        String replaced = text.replace("Java", "Python");
        System.out.println("Modified String: " + replaced);

        // 7. Whitespace Handling
        String str = "   Welcome to Java   ";
        System.out.println("Before trim: '" + str + "'");
        System.out.println("After trim: '" + str.trim() + "'");

        // 8. String Concatenation
        String concat = s1.concat(" ").concat(s2);
        System.out.println("Concatenated String: " + concat);

        // 9. String Splitting
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        System.out.println("Split words: " + Arrays.toString(words));

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" AIET");
        sb.insert(5, " Java");
        System.out.println("StringBuilder result: " + sb);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Marks: %d", "Student", 90);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation
        String email = "student@aiet.edu";

        if (email.contains("@") &&
            email.startsWith("student") &&
            email.endsWith(".edu")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}