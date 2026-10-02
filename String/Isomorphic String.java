import java.util.*;

public class Str_12_IsomorphicStringsLC205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if (s1.indexOf(a) != s2.indexOf(b)) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
