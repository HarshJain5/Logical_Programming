package Arrays;

public class Program4 {
    public static void main(String[] args) {
        int a[] = {5, 10, 20, 15};
        int small = a[0];
        for (int i = 1; i <= a.length-1; i++){
            if (small > a[i])
                small = a[i];
        }
        System.out.println(small);
    }
}
