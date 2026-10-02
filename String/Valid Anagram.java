import java.util.*;

public class Str_04_ValidAnagramLC242CountArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        if (s.length() != t.length()) {
            System.out.println("false");
            return;
        }
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
            c[t.charAt(i) - 'a']--;
        }
        for (int val : c) {
            if (val != 0) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
