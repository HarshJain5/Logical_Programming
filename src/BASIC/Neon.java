package BASIC;

public class Neon {
    public static  boolean neon(int n){
        int sq = n * n;
        int sum = 0;
        while(sq > 0){
            int digit = sq % 10;
            sum = sum + digit;
            sq = sq / 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 9;

        System.out.println(neon(n) ? "Number is neon." : "Number is not neon.");
    }
}
