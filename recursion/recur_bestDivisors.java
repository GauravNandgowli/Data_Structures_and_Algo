package recursion;

import java.util.ArrayList;

public class recur_bestDivisors {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(recur(36, 1, arr));
        ;
    }

    static ArrayList<Integer> recur(int n, int i, ArrayList<Integer> arr) {

        if (i > (Math.sqrt(n))) {
            return arr;
        }
        if (n % i == 0) {
            arr.add(i);
            int val = n / i;
            arr.add(val);
        }
        i++;
        recur(n, i, arr);
        return arr;

    }
}