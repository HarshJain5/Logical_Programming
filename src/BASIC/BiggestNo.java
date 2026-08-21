package BASIC;

public class BiggestNo {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 70;
//        int c = 25;
//
//        if (a > b && a > c) {
//            System.out.println(a + " is greatest number");
//        } if (b > a && b > c){
//            System.out.println(b + " is greatest number");
//        } else{
//            System.out.println(c + " is greatest number");
//        }

        //?Approach-2
        int a = 10, b = 20, c = 30;
        int big = a;

        if (b > big){
            big = b;
        }if (c > big){
            big = c;
        }
        System.out.println(big+ " is greatest number");
    }
}
