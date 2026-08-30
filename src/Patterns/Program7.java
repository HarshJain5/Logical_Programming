package Patterns;

//A A A A A
//B B B B B
//C C C C C
//D D D D D
//E E E E E

public class Program7 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++){
            for (int j = 1 ; j <= 5; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
