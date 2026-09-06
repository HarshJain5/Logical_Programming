//package Patterns;
//
//public class Program41 {
//    public static void main(String[] args) {
//        int n = 5;
//        int sp = n/2+1;
//        int st = 1;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= sp; j++){
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= st; j++){
//                if (j==1 || j==st || j==n)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            if (i<=n){
//                sp--;
//                st+=2;
//            }else {
//                sp++;
//                st-=2;
//            }
//            System.out.println();
//
//        }
//    }
//}
