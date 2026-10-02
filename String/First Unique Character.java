import java.util.*;

public class Str_06_FirstUniqueCharacterLC387 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] c = new int[26];
        for (char ch : s.toCharArray()) {
            c[ch - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (c[s.charAt(i) - 'a'] == 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
