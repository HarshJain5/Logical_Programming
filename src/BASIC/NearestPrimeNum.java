package BASIC;


public class NearestPrimeNum {
    public static void main(String[] args) {
        System.out.println(nearestPrime(20));
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
    public static int nearestPrime(int n) {
        int prev = n - 1;
        int next = n + 1;
       while (true){
            if (isPrime(n)) return n  ;
            if (isPrime(prev)) return prev ;
            if (isPrime(next)) return next ;
            next ++ ;
            prev -- ;
        }
    }
}