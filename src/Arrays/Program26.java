package Arrays;

//find nth biggest ele

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Program26 {
    public static void main(String[] args) {
        int a[] = {10,20,10,20,30,40,50};
        HashSet hs = new HashSet();

        for (int i = 0; i <= a.length-1; i++){
            hs.add(a[i]);
        }

        ArrayList al = new ArrayList(hs);
        Collections.sort(al);
        System.out.println("Sorted Array: "+al);
        int n = 4;
        if (n >= 1 && n <= al.size()){
            System.out.println(al.get(n-1));
        }
    }
}
