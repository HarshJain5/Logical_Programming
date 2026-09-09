package Arrays;

import java.util.Arrays;

public class Program20 {
    public static void main(String[] args) {

        //to print first pair of element whose sum is equal to target
        int a[] = {3,2,0,5,4,7,1};
        int target = 6;
//        for (int  i = 0; i <= a.length-1; i++){
//            for (int j = i+1; j <= a.length-1; j++){
//                if (a[i]+a[j] == target){
//                    System.out.println(a[i]+", "+a[j]);
//                    return;
//                }
//            }
//        }
        //to print index
        int result[] = findind(a,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findind(int a[],int target){
        //to print first pair of element's index whose sum is equal to target
        for (int  i = 0; i <= a.length-1; i++){
            for (int j = i+1; j <= a.length-1; j++){
                if (a[i]+a[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int []{};
    }
}
