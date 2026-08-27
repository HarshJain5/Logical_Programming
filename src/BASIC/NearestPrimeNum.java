package BASIC;


public class NearestPrimeNum {
    public static void main(String[] args) {
        System.out.println(nearestPrime(10));
    }

    public static boolean isPrime(int n){
        if (n < 2){
            return false;
        }

        for (int i =2; i<=n/2; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int nearestPrime(int n){
        int next = n + 1;
        int prev = n - 1;
        if (isPrime(n)){
            return n;
        }

        while (true){
            if (isPrime(prev)){
                return prev;
            } else if (isPrime(next)) {
                return next;
            }
            prev--;
            next++;
        }
    }
}
