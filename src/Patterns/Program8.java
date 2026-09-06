package Patterns;

//a b c d e
//a b c d e
//a b c d e
//a b c d e
//a b c d e

public class Program8 {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 5; i++){
            for (char j = 'a'; j <= 'e'; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
