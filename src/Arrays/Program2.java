package Arrays;

public class Program2 {
    public static void main(String[] args) {
        int a[] = {1, 5, 3, 2, 7, 6, 8};
        int sum = 0;
        for (int i = 0; i <= a.length-1; i++){
            if (a[i] % 2 != 0){
                sum = sum + a[i];
            }
        }
        System.out.println(sum);
    }
}
