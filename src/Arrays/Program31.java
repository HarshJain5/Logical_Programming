package Arrays;

public class Program31 {
    public static void main(String[] args) {
        int a[] = {2,3,7,8,9,10,20};
        int maxlen = 0;
        int len = 1;

        for (int i = 0; i <=a.length-2; i++){
            if (a[i]+1==a[i+1])
                len++;
            else {
//                if (maxlen < len)
//                    maxlen = len;
                maxlen = Math.max(maxlen,len);

                len = 1;
            }
        }
//        if (maxlen < len)
//            maxlen = len;
        maxlen = Math.max(maxlen,len);
        System.out.println(maxlen);
    }
}
