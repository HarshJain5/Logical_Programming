package BASIC;

public class PalindromeSum1to500 {

    public static boolean isPalindrome(int n){
        int rev = 0;
        int num = n;
        while (n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        return rev == num;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=500; i++){
            if (isPalindrome(i)){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
