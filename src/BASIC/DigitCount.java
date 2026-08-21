package BASIC;

public class DigitCount {
    public static int countOfDigits(int n){
        int count = 0;
        while (n > 0){
            int digit = n % 10;
            count++;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 2344;

        System.out.println(countOfDigits(n));
    }
}
