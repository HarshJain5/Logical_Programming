package BASIC;

public class OddSum {
    public static int sumOfOdd(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            if (digit % 2 != 0){
                sum = sum + digit;
            }
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 2345;

        System.out.println(sumOfOdd(n));
    }
}
