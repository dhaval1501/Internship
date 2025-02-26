package Library.csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class test {
    BufferedWriter b=new BufferedWriter(new FileWriter("test.csv"));
    ArrayList<String> s=new ArrayList<>();

    public test() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        test t=new test();
        t.s.add("dhaval");
        t.s.add("dhaval");
        t.s.add("dhaval");
        t.s.add("dhaval");
        for (String s:t.s){
            t.b.write(s);
        }
        System.out.println(t.s.get(0));
       t.b.close();
    }
}
