import java.util.*;

public class Str_11_CheckIfSentenceIsAPangramLC1832 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (a.indexOf(ch) == -1) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
