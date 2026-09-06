package Arrays;

public class Program3 {
    public static void main(String[] args) {
        int a[] = {5, 10, 20, 15};
        int big = a[0];
        for (int i = 1; i <= a.length-1; i++){
            if (big < a[i])
                big = a[i];
        }
        System.out.println(big);
    }
}
