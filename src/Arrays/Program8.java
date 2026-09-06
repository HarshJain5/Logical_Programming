package Arrays;

public class Program8 {
    public static int linearSearch(int a[], int target){
        for (int i = 0; i <= a.length-1; i++) {
            if (a[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 70};
        int target = 100;
        int index = linearSearch(a, target);

        if (index==-1)
            System.out.println("Not Found");
        else
            System.out.println("Element is found on index: "+index);
    }
}
