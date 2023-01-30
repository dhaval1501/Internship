package OOP.test;

public class Demo implements MultiIF,MultiIF1{

    @Override
    public void display(){
        MultiIF.super.display();
    }

    public static void main(String[] args) {
        MultiIF d=new Demo();
        d.display();

    }
}
