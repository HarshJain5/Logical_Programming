package Arrays;

public class Program1 {
    public static void main(String[] args) {
        int a[] = {1, 5, 3, 2, 7, 6, 8};
        for (int i = 0; i <= a.length-1; i++){
            if (a[i] % 2 == 0){
                System.out.println(a[i]);
            }
        }
    }
}
