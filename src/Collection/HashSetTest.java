package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(3);
        System.out.println(set);
//        set.remove(2);
//        System.out.println(set);
//        System.out.println("size="+set.size());

       Iterator<Integer> it=set.iterator();
       int a;

       while (it.hasNext()){
           a=it.next();
           if (a==2){
               set.remove(a);
           }
       }
       System.out.println(set);

    }
}
