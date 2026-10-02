import java.util.*;

public class Str_08_DefangingAnIPAddressLC1108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a.replace(".", "[.]"));
    }
}
