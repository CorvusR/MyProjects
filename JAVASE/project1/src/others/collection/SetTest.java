package others.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add('1');
        s.add('0');
        s.add("3");
        s.add("4");
        Iterator it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
