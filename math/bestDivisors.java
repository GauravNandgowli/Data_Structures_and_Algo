import java.util.ArrayList;

public class bestDivisors {

    public static void main(String[] args) {
        System.out.println(divList(36));
    }

    static ArrayList<Integer> divList(int n) {
        ArrayList<Integer> div = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                div.add(i);
                div.add((n / i));
            }
        }
        return div;

    }
}