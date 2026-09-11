package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

// remove duplicate elements

public class Program25 {

    // recommended approach
    public static void main(String[] args) {
        int a[] = {30, 20, 10, 40, 50, 40, 30};
        // recommended because complexity less but it ill not maintain order
//        HashSet hs = new HashSet();
//
//        for (int i = 0; i <= a.length-1; i++){
//            hs.add(a[i]);
//        }
//        System.out.println(hs);
        //it maintains order but complexity more
        LinkedHashSet hs = new LinkedHashSet();

        for (int i = 0; i <= a.length-1; i++){
            hs.add(a[i]);
        }
        System.out.println(hs);
    }


//    other approach
//    public static void main(String[] args) {
//
//        int a[] = { 1,1,2,2,3,3,4,4,5,5 };
//        boolean visited[] = new boolean[a.length];//to store the data of visited element
//        int unique=0;
//        for (int i = 0; i <= a.length - 1; i++) {
//            if (visited[i] == false) {
//                unique++;
//                int count = 1;
//                for (int j = i + 1; j <= a.length - 1; j++) {
//                    if (a[i] == a[j]) {
//                        count++;
//                        visited[j] = true;//if element visited set its flag as true
//                    }
//                }
////				System.out.println(a[i] + " -> " + count);
//            }
//        }
////		System.out.println(unique);
//        int c[] = new int [unique];
//        int x=0;
////		System.out.println(c.length);
//        for(int i =0;i<=a.length-1;i++)
//        {
//            if(visited[i]==false)
//            {
//                c[x]=a[i];
//                x++;
//            }
//        }
//        System.out.println(Arrays.toString(c));
//    }
}
