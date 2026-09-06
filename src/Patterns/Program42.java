package Patterns;

//          2
//          3  5
//          7 11 13
//          17 19 23 29

public class Program42 {
    public static boolean isPrime(int a){
        if (a <= 1)
            return false;
        for (int i = 2; i <= a/2; i++){
            if (a%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        int a = 2;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                while (isPrime(a)==false){
                    a++;
                }
                System.out.printf("%3d",a);
                a++;
            }
            System.out.println();
        }
    }
}
