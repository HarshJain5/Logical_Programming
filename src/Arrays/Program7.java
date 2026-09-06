package Arrays;

public class Program7 {
    public static  boolean isPalindrome(int n){
        int num=n;
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        return num==rev;
    }

    public static void main(String[] args) {
        int arr[] = {11,33,22,45,67,99};
        int count = 0;
        for (int i=0; i<= arr.length-1;i++){
            if (isPalindrome(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
