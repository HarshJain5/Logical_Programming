package BASIC;

public class Power {
    public static int power(int n, int p){
        int pow = 1;
        for (int i = 1; i <= p; i++){
            pow = pow * n;
        }
        return pow;
    }

    public static void main(String[] args) {
        int n = 5;
        int p = 2;

        System.out.println(power(n,p));
    }
}
