package BASIC;

public class Spy {
    public static boolean isSpy(int n){
        int sum = 0;
        int prod = 1;
        while(n > 0){
            int digit = n%10;
            sum = sum + digit;
            prod = prod * digit;

            n = n/10;
        }
        return sum == prod;
    }

    public static void main(String[] args) {
        int n = 2114;

        System.out.println(isSpy(n) ? "Number is Spy" : "Number is not Spy");
    }
}
