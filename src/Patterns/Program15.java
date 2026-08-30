package Patterns;

//A
//a b
//A B C
//a b c d
//A B C D E

public class Program15 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int j=0; j<i; j++){
                if (i%2!=0){
                    System.out.print((char)('A' + j) + " ");
                }else {
                    System.out.print((char)('a' + j) + " ");
                }
            }
            System.out.println();
        }
    }
}
