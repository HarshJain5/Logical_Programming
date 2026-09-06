package Arrays;

import java.util.Arrays;

//using bubble sort technique
//descending order
public class Program12 {
    public static void sorted(int a[]){
        for (int i = 0; i <= a.length-1; i++){
            for (int j = i+1; j <= a.length-1; j++){
                if (a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {2, 5, 1, 9, 4};
        sorted(a);
        System.out.println(Arrays.toString(a));
    }
}
