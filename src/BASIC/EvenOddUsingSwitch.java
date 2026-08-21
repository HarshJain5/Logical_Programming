package BASIC;

public class EvenOddUsingSwitch {
    public static void main(String[] args) {
        int n = 15;

        switch (n%2){
            case 0:
                System.out.println(n+ " is even number");
                break;
            case 1:
                System.out.println(n+ " is odd number");
        }
    }
}
