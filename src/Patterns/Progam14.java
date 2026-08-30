package Patterns;

//a
//a b
//a b c
//a b c d
//a b c d e

public class Progam14 {
    public static void main(String[] args) {
        for (char i='a'; i <= 'e'; i++){
            for (char j='a'; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
