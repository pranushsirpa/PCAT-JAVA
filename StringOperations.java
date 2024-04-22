public class StringOperations {
    public static String extractMiddleSubstring(String str1, String str2, int length) {
        String concatenated = str1.concat(str2);
        String reversed = new StringBuilder(concatenated).reverse().toString();
        int startIndex = (reversed.length() - length) / 2;
        if (startIndex < 0) {
            return "Substring length is larger than the concatenated string.";
        }
        
        String middleSubstring = reversed.substring(startIndex, startIndex + length);
        return middleSubstring;
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        int length = 4;
        
        String middleSubstring = extractMiddleSubstring(str1, str2, length);
        System.out.println("Middle Substring: " + middleSubstring);
    }
}
