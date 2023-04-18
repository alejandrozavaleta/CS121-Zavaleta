package Activity32;

public class BalancedBracketsTester {
    public static void main(String[] args) {
        String str1 = "()";
        String str2 = "()[]{}";
        String str3 = "(]";
        String str4 = "([)]";
        String str5 = "{[]}";
        String str6 = "([)";


        System.out.println("String " + str1 + " is balanced: " + BalancedBrackets.isBalanced(str1));
        System.out.println("String " + str2 + " is balanced: " + BalancedBrackets.isBalanced(str2));
        System.out.println("String " + str3 + " is balanced: " + BalancedBrackets.isBalanced(str3));
        System.out.println("String " + str4 + " is balanced: " + BalancedBrackets.isBalanced(str4));
        System.out.println("String " + str5 + " is balanced: " + BalancedBrackets.isBalanced(str5));
        System.out.println("String " + str6 + " is balanced: " + BalancedBrackets.isBalanced(str6));
    }
}
