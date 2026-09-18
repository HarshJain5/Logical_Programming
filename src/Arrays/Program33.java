package Arrays;

public class Program33 {
    public static void main(String[] args) {
        int a[] = {2,4,1};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= a.length-1; i++){
            if (a[i] < min){
                min = a[i];
            }
            int profit = a[i] - min;
            max = Math.max(profit,max);
        }
        System.out.println(max);
    }
}
