package Arrays;

//finding nth smallest element

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Program27 {
    public static void main(String[] args) {
        int a[] = {10,40,30,20,50,20,30};
        HashSet hs = new HashSet();
        for (int i = 0; i <= a.length-1; i++){
            hs.add(a[i]);
        }

        ArrayList al = new ArrayList(hs);
        Collections.sort(al);
        System.out.println("Sorted Array: "+al);

        int n = 4;
        if (n >= 1 && n <= al.size()){
            System.out.println(al.get(al.size()-n));
        }
    }
}
