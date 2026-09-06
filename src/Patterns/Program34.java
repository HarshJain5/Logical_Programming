package Patterns;

//                1
//              1 2 1
//            1 2 3 2 1
//          1 2 3 4 3 2 1
//            1 2 3 2 1
//              1 2 1
//                1

public class Program34 {
    public static void main(String[] args) {
        int n = 7;
        int sp = n/2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*st-1; j++){
                if (j<=st) {
                    System.out.print(j + " ");
                }
                else {
                    System.out.print((2 * st - j) + " ");
                }
            }
            if (i<=n/2){
                sp--;
                st++;
            }else{
                sp++;
                st--;
            }
            System.out.println();
        }
    }
}
