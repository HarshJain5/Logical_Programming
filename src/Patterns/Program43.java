package Patterns;

//        *           *
//        * *       * *
//        * * *   * * *
//        * * * * * * *

public class Program43 {
    public static void main(String[] args) {
        int n = 4;
        int sp = 2*n-3;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=sp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                if(i==n&&j==i) {
                    break;
                }
                System.out.print("* ");
            }
            System.out.println();
            sp = sp -2;
        }
    }
}
