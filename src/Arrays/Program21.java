package Arrays;

public class Program21 {
    public static void main(String[] args) {
        int a[] = {30,40,60,50,55};
        int largest = a[0], seclargest = a[0];
        for (int i = 0; i <= a.length-1; i++){
            if (a[i] > largest){
                seclargest = largest;
                largest = a[i];
            } else if (a[i] > seclargest && a[i] != largest) {
                seclargest = a[i];
            }
        }
        System.out.println("Second Largest: "+seclargest);
        System.out.println("First Largest: "+largest);
    }
}
