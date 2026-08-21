package BASIC;

public class CountPrime {

    public static int countOfPrimeDigits(int n) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;

            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 2344;

        System.out.println("count  " + countOfPrimeDigits(n));
    }
}