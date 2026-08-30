package BASIC;

public class Armstrong {

    public static int countDigit(int n){
        int count = 0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int power(int n, int p){
        int res = 1;
        for (int i = 1; i <= p; i++){
            res = res * n;
        }
        return res;
    }
    public static boolean isArmStrong(int n ){
        int count = countDigit(n);
        int sum = 0;
        int num = n;
        while(n>0){
            int digit = n%10;
            int pow = power(digit,count);
            sum = sum+pow;
            n=n/10;
        }
        return sum==num;
    }

//    public static int power(int n, int p){
//        p = countDigit(n);
//
//        int pow = 1;
//        while (n > 0){
//            int digit = n%10;
//            for (int i=1; i<=p; i++){
//                pow = pow * digit;
//            }
//        }
//        return pow;
//    }
//
//    public static boolean isArmStrong(int n){
//        int sum = 0;
//
//    }

//    public static boolean isArmStrong(int n) {
//    int count = countDigit(n) ; int num=n ;
//    int sum = 0 ;
//    while (n > 0) {
//        int digit = n % 10 ;
//        int res = 1;
//        for (int i = 1; i <= count ; i++) {
//            res = res * digit ;
//        }
//        System.out.println(res);
//        sum = sum + res ;
//        n = n / 10 ;
//    }
//        return sum == num;
//    }
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmStrong(n));
    }
}
