package Arrays;

public class Program15 {
    public static void main(String[] args) {
        int a[] = {2, 3, 7, 3, 2, 2, 1};

        for (int i = 0; i <= a.length-1; i++){
            int count = 0;
            for (int j = i+1; j <= a.length-1; j++){
                if (a[i]==a[j]){
                    count++;
                }
                System.out.println(a[i]+"->"+count);
            }
        }
    }
}
