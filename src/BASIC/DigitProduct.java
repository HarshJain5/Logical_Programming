package BASIC;

public class DigitProduct {
    public static int productOfDigits(int n){
        int prod = 1;
        while (n > 0){
            int digit = n % 10;
            prod = prod * digit;
            n = n/10;
        }
        return prod;
    }

    public static void main(String[] args) {
        int n = 234;

        System.out.println(productOfDigits(n));
    }
}
