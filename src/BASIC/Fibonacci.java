//package BASIC;
//
//public class Fibonacci {
//    public static void main(String[] args) {
//        int n = 10;
//        int f1=0, f2=1,sum=0;
//        System.out.println(f1+" "+f2+" ");
//        for (int i=0; i<=n-2; i++){
//            sum = f1+f2;
//            System.out.println(sum+" ");
//            f1 = f2;
//            f2 = sum;
//        }
//    }
//}


package BASIC;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int f1 = 0, f2 = 1, sum = 0;

        // Use print() instead of println() to keep the sequence on one line
        System.out.print(f1 + " " + f2 + " ");

        // Changed '<=' to '<' to execute exactly 8 times (making 10 total terms)
        for (int i = 0; i <= n - 2; i++) {
            sum = f1 + f2;
            System.out.print(sum + " ");
            f1 = f2;
            f2 = sum;
        }
    }
}