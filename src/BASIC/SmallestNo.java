package BASIC;

public class SmallestNo {
    public static void main(String[] args) {
        int a = 20, b = 30, c = 15, d = 10;
        int small = a;

        if(b < small){
            small = b;
        }if(c < small){
            small = c;
        } if(d < small){
            small = d;
        }
        System.out.println(small+ " is the smallest number.");
    }
}
