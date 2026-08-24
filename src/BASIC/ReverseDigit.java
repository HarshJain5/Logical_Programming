package BASIC;

public class ReverseDigit {


    public static int reverseDigit(int n  ) {
        int rev = 0 ;
        while (n > 0) {
            int digit = n % 10 ;
            rev = rev * 10 + digit ;
            n = n/10 ;
        }

        return rev ;
    }

    public static void main(String[] args) {
        int n = 234;
        System.out.println((reverseDigit(n)));
    }
}




























//
//public static int reverseDigit(int n){
//    int rev = 0;
//    while (n > 0){
//        int lastdigit = n % 10;
//        rev = rev * 10 + lastdigit;
//        n = n / 10;
//    }
//    return rev;
////}