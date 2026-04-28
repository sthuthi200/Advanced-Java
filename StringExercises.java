package mypackage;

public class StringExercises {

    // Q1: Check if string is null or empty/whitespace
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    // Q2: Count occurrences of substring
    public static int countOccurrences(String mainStr, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        return count;
    }

    // Q3: Reverse string
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Q4: Check palindrome (ignore case & punctuation)
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Q5: Remove all whitespace
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {

        // Q1 Test
        String test1 = "   ";
        System.out.println("Is null or empty: " + isNullOrEmpty(test1));

        // Q2 Test
        String mainStr = "Java is fun. Java is powerful. Java is popular.";
        String subStr = "Java";
        System.out.println("Occurrences of '" + subStr + "': " +
                countOccurrences(mainStr, subStr));

        // Q3 Test
        String original = "Hello";
        System.out.println("Reversed string: " + reverseString(original));

        // Q4 Test
        String palindromeTest = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome: " + isPalindrome(palindromeTest));

        // Q5 Test
        String whitespaceStr = "J a v a   P r o g r a m";
        System.out.println("After removing whitespace: " +
                removeWhitespace(whitespaceStr));
    }
}