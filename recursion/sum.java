public class sum {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 4, 2, 5 };

        System.out.println(count(arr, arr.length));
    }

    public static int count(int[] arr, int n) {

        if (n == 0)
            return 0;
        return arr[n - 1] + count(arr, n - 1);
    }

}
