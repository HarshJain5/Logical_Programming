package Arrays;

public class Program19 {
    public static void main(String[] args) {
        int a[] = {10,20,10,30,20,40,20};
        boolean b[] = new boolean[a.length];

        int maxCount = 0;
        int mostRepeatedEle = a[0];
        for (int i = 0; i <= a.length-1; i++){
            if (b[i] == false){
                int count = 1;
                for (int j = i+1; j <= a.length-1; j++){
                    if (a[i]==a[j]){
                        count++;
                        b[j] = true;
                    }
                }
                if (count>maxCount){
                    maxCount = count;
                    mostRepeatedEle = a[i];
                }
            }
        }
        System.out.println(mostRepeatedEle);
    }
}
