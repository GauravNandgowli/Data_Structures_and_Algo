import java.util.ArrayList;

public class sqrtDiv {
    public static void main(String[] args) {
        int n = 37;
        ArrayList<Integer> divisors = new ArrayList<>();

        // Loop from 1 to n / 2
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                divisors.add(n / i);// Add the divisor to the list
            }
        }

        // Print the divisors
        System.out.println("Divisors of " + n + ": " + divisors);
    }
}
/**
 * 
 * 
 * The time complexity of this program can be analyzed based on two main
 * factors:
 * 
 * 1. **The number of iterations in the main loop**: The program loops through
 * each integer `i` from `2` to `n-1`, so it runs **n - 2** iterations in total.
 * This is O(n).
 * 
 * 2. **The number of iterations for each call to `isPrime(i)`**:
 * - For each number `i`, the `isPrime(i)` function checks divisibility from `2`
 * to `sqrt(i)`. The number of iterations for each `i` is proportional to the
 * square root of `i`, or O(√i).
 * 
 * So, the overall time complexity is a combination of these two factors:
 * 
 * - The outer loop runs **n - 2** times.
 * - For each iteration of the outer loop, `isPrime(i)` runs in O(√i) time.
 * 
 * ### Total Time Complexity:
 * 
 * To determine the total time complexity, we sum the time for each `i` from `2`
 * to `n-1`:
 * 
 * \[
 * T(n) = \sum_{i=2}^{n-1} O(\sqrt{i})
 * \]
 * 
 * This sum is approximately:
 * 
 * \[
 * T(n) = O(\sum_{i=2}^{n} \sqrt{i})
 * \]
 * 
 * The sum of square roots from 1 to `n` is roughly \(O(n^{3/2})\), since:
 * 
 * \[
 * \sum_{i=1}^{n} \sqrt{i} \approx \int_1^n \sqrt{x} dx = \frac{2}{3} n^{3/2}
 * \]
 * 
 * Therefore, the overall time complexity is:
 * 
 * \[
 * T(n) = O(n^{3/2})
 * \]
 * 
 * ### Conclusion:
 * 
 * The time complexity of this program is **O(n^{3/2})**, which means the
 * algorithm will take time proportional to \(n^{3/2}\) as the input size `n`
 * grows.
 * 
 * For large values of `n`, this approach could become quite slow, and
 * optimizations like the **Sieve of Eratosthenes** (which has a time complexity
 * of **O(n log log n)**) could be considered for better performance.
 * 
 */