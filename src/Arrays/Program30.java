package Arrays;

public class Program30 {
    public static boolean isAscending(int a[]){
        for (int i = 0; i <= a.length-2; i++){
            if (a[i] < a[i+1])
                return false;
        }
        return true;
    }
    public static boolean isDescending(int a[]){
        for (int i = 0; i <= a.length-2; i++){
            if (a[i] > a[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = {30,20,10};

        if (isAscending(a) || isDescending(a)){
            System.out.println("Array is sorted...");
        }else{
            System.out.println("Not Sorted");
        }
    }
}
