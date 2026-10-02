import java.util.*;

public class Str_01_LengthOfLastWordLC58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a = a.trim();
        String[] c = a.split("\\s+");
        System.out.println(c[c.length - 1].length());
    }
}
