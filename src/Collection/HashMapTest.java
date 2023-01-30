package Collection;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
        map.put(1,"Dhaval");
        map.put(2,"Fenil");
        map.put(3,"Dhari");
        map.put(4,"Prinkesh");
        map.put(5,"Raj");
        map.put(6,"Krish");
        System.out.println(map);
        System.out.println(map.keySet());
        map.remove(5);
        System.out.println(map);
    }
}
