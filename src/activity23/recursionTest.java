package activity23;

import java.util.Scanner;

public class recursionTest {

    public static void main(String[] args) {

        recursionMethod New = new recursionMethod();

        Scanner console = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = console.next();
        System.out.println(New.isPalindrome(str));
    }
}
