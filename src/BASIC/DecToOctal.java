package BASIC;

public class DecToOctal {
    public static void main(String[] args) {
        int dec = 18;
        System.out.println(decToOct(dec));
    }
    public static String decToOct(int dec){
        String oct = "";
        while(dec > 0){
            int rem = dec % 8;
            oct = rem + oct;
            dec /= 8;
        }
        return oct;
    }
}
