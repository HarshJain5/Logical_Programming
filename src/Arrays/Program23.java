package Arrays;

import java.util.Arrays;

//rotate array into right
public class Program23 {
    //Approach 3: using reversing of array and it will be best
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int k = 2;
        k = k % a.length;
        reverse(a,0,a.length-1);
//        System.out.println(Arrays.toString(a));
        reverse(a,0,k-1);
//        System.out.println(Arrays.toString(a));
        reverse(a,k,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void reverse(int a[], int i, int j){
        while (i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
}
