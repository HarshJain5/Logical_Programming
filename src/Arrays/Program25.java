package Arrays;

import java.util.Arrays;

public class Program25 {
    public static void main(String[] args) {
        int a[] = {10,30,10,20,40,20};
        int x = 0;
        for (int i = 0; i <= a.length-1; i++){
            for (int j = i+1; j <= a.length-1; j++){
                if (a[i] == a[j]){
                    a[j] = 0;
                }
            }
            if (a[i]!=0){
                a[x] = a[i];
                x++;
            }
        }
        for (int i = x; i < a.length; i++) {
            a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
