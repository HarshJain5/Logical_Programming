package BASIC;

public class FactUsingRecursion {
    public static int factorial(int n){
        if ( n == 1 || n == 0){
            return  1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 4;

        System.out.println(factorial(n));
    }
}
