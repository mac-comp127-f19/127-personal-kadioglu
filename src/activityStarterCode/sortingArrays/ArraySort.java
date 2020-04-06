package activityStarterCode.sortingArrays;

import java.util.Arrays;

public class ArraySort {

    private static String[] merge(String[] a, String[] b) {
        int newLength = a.length + b.length;

        String[] merged = new String[newLength];

        int  i = 0, ai = 0, bi = 0;

        for (i = 0; i < newLength && (ai < a.length) && (bi < b.length); i++) {
            System.out.println("ai bi i " + ai + bi + i);
            if (a[ai].compareTo(b[bi]) < 0) {
                merged[i] = a[ai];
                ai++;
                System.out.println("ai bi i " + ai + bi + i);
            } else {
                merged[i] = b[bi];
                bi++;
                System.out.println("ai bi i " + ai + bi + i);
            }
        }

        //add the remaining elements of the non empty array to the merged
        if (ai<a.length) {
            System.out.println("here a");
            int c = i;
            for (int index = ai; index < a.length; index++) {
                merged[c] = a[index];
                c++;
            }
        }

        // if there are remaining elements in b, add them to merged
        System.out.println(Arrays.toString(merged));
        if (bi<b.length) {
            System.out.println("here b");
            int c = i;
            for (int index = bi; index < b.length; index++) {
                merged[c] = b[index];
                c++;
            }
        }
        return merged;
    }


    public static String[] sort(String[] a) {

        if(a == null) {
            return null;
        }

        if ((a.length == 1) || (a.length == 0)) {
            return a;
        }


        int mid = a.length / 2;


        String[] front = Arrays.copyOfRange(a, 0, mid);
        String[] back = Arrays.copyOfRange(a, mid, a.length);

        return merge(sort(front), sort(back));
    }

}
