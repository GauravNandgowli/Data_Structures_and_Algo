import java.util.ArrayList;

public class optimizedDivisor {

    public static void main(String[] args) {
        System.out.println(divList(10));
    }

    static ArrayList<Integer> divList(int n) {
        ArrayList<Integer> div = new ArrayList<>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                div.add(i);
        }
        div.add(n);
        return div;

    }
}