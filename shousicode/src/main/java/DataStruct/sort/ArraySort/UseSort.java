package DataStruct.sort.ArraySort;

import java.util.ArrayList;
import java.util.Comparator;

public class UseSort {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(9);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        System.out.println(arrayList);
        arrayList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2)return 1;
                else return -1;
            }
        });
        System.out.println(arrayList);
    }
}
