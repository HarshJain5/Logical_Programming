package Arrays;

import java.util.Arrays;

public class Program10 {
    public  static int[] merge(int a[], int b[]){
        int c[] = new int[a.length + b.length];
        for (int i = 0; i <= a.length-1; i++){
            c[i] = a[i];
        }
        for (int i = 0; i <= b.length-1; i++){
            c[a.length+i] = b[i];
        }
        return c;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int b[] = {4,5,6,8};
        System.out.println(Arrays.toString(merge(a,b)));
    }
}
