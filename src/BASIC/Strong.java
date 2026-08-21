package BASIC;

public class Strong {
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
        int n = 1452;  //120+24+1
        System.out.println(isStrong(n) ? "Number is Strong." : "Number is not Strong.");
    }
}
