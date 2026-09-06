package Arrays;

import java.util.Arrays;

public class Program13 {
    public static void main(String[] args) {
        int a[] = {5, 0, 1, 0, 6, 0};
        int x = 0;
        for (int i = 0; i <= a.length-1; i++){
            if (a[i] != 0){
                a[x] = a[i];
                x++;
            }
        }
        for (int i = x; i <= a.length-1; i++){
            a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
