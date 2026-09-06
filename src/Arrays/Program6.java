package Arrays;

import java.util.Arrays;

public class Program6 {
    public static int sumOfDigit(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = sum+digit;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {17,25,23,16};
        for (int i=0; i<= arr.length-1; i++){
            arr[i]=sumOfDigit(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
