package Arrays;

import java.util.Arrays;

public class Program14 {
    public static void main(String[] args) {
        int a[] = {5, 0, 1, 0, 6, 0};
        int x = a.length-1;
        for (int i = a.length-1; i >= 0; i--){
            if (a[i] != 0){
                a[x] = a[i];
                x--;
            }
        }
        for (int i = x; i >= 0; i--){
            a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
