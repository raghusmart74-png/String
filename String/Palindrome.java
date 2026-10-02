import java.util.*;

public class Str_02_PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equals(b)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
