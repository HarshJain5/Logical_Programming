package Arrays;

import java.util.Arrays;

public class Program24 {
    public static void reverse(int a[]){
        int i = 0;
        int j = a.length-1;
        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
}
