package BASIC;

import java.util.Scanner;

public class NthPrime {

    public static boolean isPrime(int n){
        if (n<=1)
            return false;

        for (int i=2; i<n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int n = sc.nextInt();
        sc.close();

        int count = 0;
        int number = 2;
        while (count<n) {
            if (isPrime(number)) {
                count++;
                if (count == n)
                    System.out.println(number);
            }
            number++;
        }
    }
}
