package BASIC;

public class DecToBinary {
    public static void main(String[] args) {
        int dec = 18;
        System.out.println(decToBin(dec));
    }
    public static String decToBin(int dec){
        String bin = "";
        while(dec > 0){
            int rem = dec % 2;
            bin = rem + bin;
            dec /= 2;
        }
        return bin;
    }
}
