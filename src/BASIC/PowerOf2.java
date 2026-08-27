package BASIC;

public class PowerOf2 {


    public static boolean isPower(int num){
        if (num <= 0) return false;
        while (num % 2 == 0) {
            num = num / 2;
        }
        return num == 1;
    }

//    public static boolean isPowerOf2(int num){
//        if (num <= 0) return false;
//        int n = 2;
//        for (int i = 1;;i++) {
//            int pow = (int) Math.pow(2, i);
//
//            if (pow == num) {
//                return true;
//            }
//
//        return false;
//            }
//    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(isPower(num) ? "Power of 2" : "Not power of 2");
//        System.out.println(isPowerOf2(num) ? "Power of 2" : "Not power of 2");
    }
}
