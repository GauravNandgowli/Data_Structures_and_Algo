public class occur {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 4, 2, 5 };

        System.out.println(count(arr, 2, 0));
    }

    public static int count(int[] arr, int target, int index) {
        int sum = 0;
        if (arr.length == index)
            return 0;
        if (arr[index] == 2)
            sum += 1;
        return sum + count(arr, target, index + 1);
    }

}
