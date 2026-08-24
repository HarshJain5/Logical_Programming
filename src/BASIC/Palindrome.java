package BASIC;

public class Palindrome {
    public static boolean isPalindrome(int n){
        int num = n;
        int rev = 0;
        while (n > 0){
            int lastdigit = n%10;
            rev = rev*10 + lastdigit;
            n = n/10;
        }
        return rev == num;
    }
    public static void main(String[] args) {
        int n = 12321 ;
//       1.  extracting other class
//        int rev = ReverseDigit.reverseDigit(num) ;
//        System.out.println(num == rev);

//        2. full code
        System.out.println(isPalindrome(n) ? n+" number is Palindrome" : n+ " number is not Palindrome");

    }
}
