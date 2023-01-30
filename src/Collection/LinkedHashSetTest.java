package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lset=new LinkedHashSet<>();
        lset.add(1);
        lset.add(2);
        lset.add(3);
        lset.add(4);
        lset.add(5);
        lset.add(1);
        System.out.println(lset);
        lset.remove(3);
        System.out.println(lset);

//

    }
}
