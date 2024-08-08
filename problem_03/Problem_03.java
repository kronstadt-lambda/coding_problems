public class Problem_03 {
    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int largestPrimeFactor(long num) {
        int largestPrime = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0 && isPrime(i)) {
                largestPrime = i;
            }
        }
        return largestPrime;
    }
    public static void main(String[] args) {

        long number = 600851475143L;
        int solution = Problem_03.largestPrimeFactor(number);

        System.out.println("The largest prime factor of " + number + " is " + solution);

    }
}