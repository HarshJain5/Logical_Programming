package Arrays;

public class Program28 {
    public static  boolean isAscending(int a[]){
        for (int i = 0; i <= a.length-2; i++){
            if(a[i] > a[i+1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        if (isAscending(a)){
            System.out.println("In Ascending Order....");
        }else{
            System.out.println("Not in Ascending order");
        }
    }
}
