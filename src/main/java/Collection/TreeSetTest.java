package Collection;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(11);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet);
        treeSet.remove(3);
        System.out.println(treeSet);
    }
}
