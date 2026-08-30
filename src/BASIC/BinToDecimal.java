package BASIC;

public class BinToDecimal {
    public static void main(String[] args) {
        int bin = 10010; // 18
        System.out.println(binToDec(bin));
    }

    public static int binToDec(int bin) {
        int dec = 0;
        int power = 0;

        while (bin > 0) {
            int rem = bin % 10;
            dec = dec + rem * (int) Math.pow(2, power);
            bin /= 10;
            power++;
        }
        return dec;
    }
}