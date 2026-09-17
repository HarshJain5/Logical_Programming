package Arrays;

public class Program32 {

//    //Approach-1 but time complexity will be n cube cube
//    public static void main(String[] args) {
//        int a[] = {2,-1,3,-2,1};
//        int maxsum = Integer.MIN_VALUE;       //to handle negative value
//        for (int i = 0; i <= a.length-1;i++){
//            for (int j = i; j <= a.length-1; j++){
//                int cursum = 0;
//                for (int k = i; k <= j; k++){
//                    cursum = cursum + a[k];
//                }
//                if (cursum > maxsum)
//                    maxsum = cursum;
//            }
//        }
//        System.out.println(maxsum);
//    }

//    //Approach-2 but time complexity will be n square
//    public static void main(String[] args) {
//        int a[] = {2,-1,3,-2,1};
//        int maxsum = Integer.MIN_VALUE;       //to handle negative value
//        for (int i = 0; i <= a.length-1;i++){
//            int cursum = 0;
//            for (int j = i; j <= a.length-1; j++){
//                    cursum = cursum + a[j];
//                if (cursum > maxsum)
//                    maxsum = cursum;
//            }
//        }
//        System.out.println(maxsum);
//    }

    //Approach-3 but time complexity will be less but recomended
    public static void main(String[] args) {
        int a[] = {2,-1,3,-2,1};
        int maxsum = Integer.MIN_VALUE;       //to handle negative value
        int cursum = 0;
        for (int i = 0; i <= a.length-1;i++){
                cursum = cursum + a[i];
                if (cursum > maxsum)
                    maxsum = cursum;

                if(cursum < 0)
                    cursum = 0;                //kedens algo says thatif sum is neghative dont carry it instead take 0
        }
        System.out.println(maxsum);
    }
}
