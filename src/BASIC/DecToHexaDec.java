package BASIC;

public class DecToHexaDec {
    public static void main(String[] args) {
        int dec = 1456;
        System.out.println(decToHexa(dec));
    }
    public static String decToHexa(int dec){
        String hex = "";
        while(dec > 0){
            int rem = dec % 16;
            if (rem > 9){
                hex = (char)(rem+55)+hex;
            }else{
                hex = rem + hex;
            }
            dec /= 16;
        }
        return hex;
    }
}
