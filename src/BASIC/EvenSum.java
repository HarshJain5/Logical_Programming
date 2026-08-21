package BASIC;

public class EvenSum {
    public static int sumOfEven(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            if (digit % 2 == 0){
                sum = sum + digit;
            }
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 234;

        System.out.println(sumOfEven(n));
    }
}
