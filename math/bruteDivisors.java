import java.util.*;

public class bruteDivisors {

    public static void main(String[] args) {
        System.out.println(divList(20));
    }

    static ArrayList<Integer> divList(int n) {
        ArrayList<Integer> div = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                div.add(i);
        }
        return div;

    }
}