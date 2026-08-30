package BASIC;

public class GCD {
    public static void main(String[] args) {
        int num1 = 60;
        int num2 = 36;
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
    }

//    public static int gcd(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }

    public static int gcd(int n, int m){
        int gcd = 1;
        for (int i=1; i<=n && i<=m; i++){
            if (n%i==0 && m%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

//    public static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);
//    }
}