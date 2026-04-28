package mypackage;

import java.util.Random;

public class StringExercises3C {

    // Q6: Capitalize first letter of each word
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }
        return result.toString().trim();
    }

    // Q7: Truncate string and add ellipsis
    public static String truncate(String str, int length) {
        if (str.length() <= length) {
            return str;
        }
        return str.substring(0, length) + "...";
    }

    // Q8: Check if string is numeric
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    // Q9: Generate random string
    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(rand.nextInt(characters.length())));
        }
        return sb.toString();
    }

    // Q10: Count number of words
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        // Q6 Test
        String sentence = "java programming is fun";
        System.out.println("Capitalized: " + capitalizeWords(sentence));

        // Q7 Test
        String longText = "This is a long string example";
        System.out.println("Truncated: " + truncate(longText, 10));

        // Q8 Test
        String numStr = "12345";
        System.out.println("Is Numeric: " + isNumeric(numStr));

        // Q9 Test
        System.out.println("Random String: " + generateRandomString(8));

        // Q10 Test
        String wordCountStr = "Java is easy to learn";
        System.out.println("Word Count: " + countWords(wordCountStr));
    }
}