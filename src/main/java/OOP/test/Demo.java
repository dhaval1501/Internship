package OOP.test;

import java.util.Scanner;

public class Demo implements MultiIF,MultiIF1{
    
    @Override
    public void display() {
        MultiIF.super.display();
    }

}
