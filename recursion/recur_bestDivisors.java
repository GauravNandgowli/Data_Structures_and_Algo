package recursion;

import java.util.ArrayList;

public class recur_bestDivisors {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(forwardRecur(36, 1, arr));
        System.out.println(backwardRecur(36, 1));

    }

    static ArrayList<Integer> forwardRecur(int n, int i, ArrayList<Integer> arr) {

        if (i > (Math.sqrt(n))) {
            System.out.println("last array  " + arr);
            return arr;
        }
        if (n % i == 0) {
            arr.add(i);
            int val = n / i;
            arr.add(val);
        }
        i++;
        forwardRecur(n, i, arr);
        return arr;

    }

    static ArrayList<Integer> backwardRecur(int n, int i) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (i > (Math.sqrt(n))) {
            return arr;
        }
        if (n % i == 0) {
            arr.add(i);
            int val = n / i;
            arr.add(val);
        }
        i++;
        ArrayList<Integer> fin = backwardRecur(n, i);
        arr.addAll(fin);
        return arr;
    }
}