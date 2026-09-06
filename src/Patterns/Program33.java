package Patterns;
//
//        A
//      a b c
//    A B C D E
//  a b c d e f g
//    A B C D E
//      a b c
//        A

public class Program33 {
    public static void main(String[] args) {
        int n=7;
        int sp = n/2;
        int st =1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=sp; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=st*2-1; j++){
                if (i%2==0)
                    System.out.print((char)(j+96)+" ");
                else
                    System.out.print((char)(j+64)+" ");
            }
            if (i <= n/2){
                sp--;
                st++;
            }else {
                sp++;
                st--;
            }
            System.out.println();
        }
    }
}
