package BASIC;

public class WarmUp {
    public static void main(String[] args) {
        int n = 9;

        if ((n % 3 == 0) && (n % 5 == 0)) {
            System.out.println("Sanju weds Geeta");
        }else if (n % 3 == 0){
            System.out.println("Sanju");
        }else if (n % 5 == 0){
            System.out.println("Geeta");
        }else {
            System.out.println("Breakup");
        }
    }
}
