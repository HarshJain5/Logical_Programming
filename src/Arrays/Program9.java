package Arrays;

import java.util.Arrays;

public class Program9 {
    public static void main(String[] args) {
        int a[] = {1,0,3,4};
        int n = a.length;
        int nSum = n*(n+1)/2;
//        int sum = 0;
//        for (int i = 0; i <= a.length-1; i++){
//            sum = sum+a[i];
//        }
//        System.out.println(nSum-sum);

        //2.
        int sum = Arrays.stream(a).sum();
        System.out.println(nSum-sum);
    }
}
