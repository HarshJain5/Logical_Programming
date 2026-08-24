package BASIC;

public class Strong1to1000 {

    public static boolean isStrong(int n){
        int sum = 0;
        int num = n;
        while (n > 0){
            int digit = n % 10 ;
            int fact = 1 ;
            for (int i = 1 ; i <= digit; i++) {
                fact = fact * i ;
            }
            sum = sum + fact ;
            n = n /10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int i=1; i<=1000; i++){
            if (isStrong(i))
                count++;
            }
        System.out.println(count);
    }
}
