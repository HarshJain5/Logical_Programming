package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

//rotate array into left
public class Program22 {
    //Approach 1: using extra variable or nested loop but time complexity more
//    public static void main(String[] args) {
//        int a[] = {10, 20, 30, 40, 50};
//        int k = 5;
//        k = k % a.length;
//        for (int j = 1; j <= k; j++){
//            int temp = a[0];
//            for (int i = 0; i <= a.length-2; i++){
//                a[i] = a[i+1];
//            }
//            a[a.length-1] = temp;
//        }
//        System.out.println(Arrays.toString(a));
//    }


//    //Approach 2: using new array but time complexity still little bit more
//    public static void main(String[] args) {
//        int a[] = {10, 20, 30, 40, 50};
//        int temp[] = new int[a.length];
//        int k = 2;
//        k = k % a.length;
//        int x = 0;
//        for (int i = k; i <= a.length-1; i++){
//            temp[x] = a[i];
//            x++;
//        }
//        for (int i = 0; i < k; i++){
//            temp[x] = a[i];
//            x++;
//        }
//        System.out.println(Arrays.toString(temp));
//    }


    //Approach 3: using reversing of array and it will be best
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int k = 2;
        k = k % a.length;
        reverse(a,0,k-1);
//        System.out.println(Arrays.toString(a));
        reverse(a,k,a.length-1);
//        System.out.println(Arrays.toString(a));
        reverse(a,0,a.length-1);
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
