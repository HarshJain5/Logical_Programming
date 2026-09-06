package Arrays;

public class Program5 {
    public static boolean isPrime(int n){
        if (n<=1)
            return false;

        for (int i=2; i<=n/2; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 3, 2, 9, 11};
        for (int i=0; i<= arr.length-1; i++){
            if (isPrime(arr[i]))
                System.out.println(arr[i]);
        }
    }
}
