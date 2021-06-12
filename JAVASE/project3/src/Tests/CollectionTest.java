package Tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
 /*       for (Integer integer : list) {
            System.out.print(integer+" ");
        }*/
        hello();
    }

    static String hello() {
        System.out.println("hello");
        return null;
    }
}
