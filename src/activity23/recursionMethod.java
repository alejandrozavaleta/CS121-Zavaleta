package activity23;

public class recursionMethod {

    public static boolean isPalindrome(String str) {
        if (str == null || str.length() <= 1)
        {
            return true;
        }

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        if (firstChar == lastChar) {

            String newStr = str.substring(1, str.length() - 1);

            return isPalindrome(newStr);
        } else {
            return false;
        }
    }

}
// The time complexity of this method is O(n) because in the worst case,
//the method will need to compare each pair of characters in the string.