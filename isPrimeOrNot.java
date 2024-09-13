public class isPrimeOrNot {

    public static void main(String[] args) {

        int x = 4;
        int y = 2;
        System.out.println(x % y);
        System.out.println(x / y);
        System.out.println(isPrime(50));

    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
