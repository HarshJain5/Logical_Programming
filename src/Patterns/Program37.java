package Patterns;

//        1 2 3 4 5 6 7
//          1 2 3 4 5
//            1 2 3
//              1
//            1 2 3
//          1 2 3 4 5
//        1 2 3 4 5 6 7

public class Program37 {
    public static void main(String[] args) {
        int n= 7;
        int sp = 0;
        int st = n;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= sp; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= st; j++){
                System.out.print(j+" ");
            }
            if (i<=n/2){
                sp++;
                st -= 2;
            }
            else{
                sp--;
                st += 2;
            }
            System.out.println();
        }
    }
}
