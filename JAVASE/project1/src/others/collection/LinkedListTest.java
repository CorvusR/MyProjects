package others.collection;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        /*LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        for (int i = 0; i < 10; i++) {
            ll.add(i);
        }*/
        /*ll.removeFirst();
        ll.pop();*/
        /*for (int a : ll) {
            System.out.println(a);
        }*/
        LinkedList<String> ll = new LinkedList<>();
        ll.add("a");
        ll.add("0");
        ll.add("1");
        ll.add("2");
        ll.add("A");
        Collections.sort(ll);
       /* ll.removeIf(e->e.contains("1"));*/
        /*ll.remove(0);
        ll.replaceAll(e->e.toUpperCase(Locale.ROOT));
        for (String s : ll) {
            System.out.println(s);
        }*/
        Iterator<String> it = ll.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
    }
}

