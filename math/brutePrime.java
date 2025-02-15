class brutePrime {

    public static void main(String[] args) {
        System.out.println(isPrime(991));
    }

    static boolean isPrime(int n) {
        if (n == 0 || n == 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;

        }

        return true;

    }

}