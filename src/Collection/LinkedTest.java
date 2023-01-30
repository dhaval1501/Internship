package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedTest {
    public static void main(String[] args) {


        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.set(1, 8);
        System.out.println(list);

        System.out.println(list.get(3));

    }
}
