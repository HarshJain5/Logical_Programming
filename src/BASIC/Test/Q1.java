package BASIC.Test;

public class Q1 {
    public static void main(String[] args) {
        int n = 25;

        int square = n * n;
        int temp = n;
        int divisor = 1;

        while (temp > 0) {
            divisor = divisor * 10;
            temp = temp / 10;
        }

        if (square % divisor == n) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Not Automorphic");
        }
    }
}

