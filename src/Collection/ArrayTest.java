package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayTest {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.set(1,8);
        System.out.println(list);
//        Iterator<Integer> it=list.iterator();
//        int a;
//
//        while (it.hasNext()){
//            a=it.next();
//            if (a==5){
//                list.remove(a);
//            }
//        }
//        System.out.println(list);

        System.out.println(list.get(3));
        list.clear();
        System.out.println(list);

    }
}
