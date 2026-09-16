package Arrays;

public class Program29 {
    public static boolean isDescending(int a[]){
        for (int i = 0; i <= a.length-2; i++){
            if (a[i] < a[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = {50,40,30,20,10};
        if (isDescending(a)){
            System.out.println("In Descending Order.....");
        }else{
            System.out.println("Not in Descending order");
        }
    }
}
