package BASIC;

import java.util.Scanner;

//import static BASIC.CheckPrime.isPrime;

public class FirstNPrime {

    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }

        for (int i=2; i<n; i++){
            if (n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int n = sc.nextInt();

        int count = 0;
        int number = 2;
        while (count<n){//2<3
            if (isPrime(number)) {//3
                System.out.println(number);
                count++;//2
            }
            number++;//4
        }
    }
}
