package OOP.test;

public class Covariant extends Covariant1 {
//    @Override
//    public short add(){
//        short a=10,b=20;
//        return (short) (a+b);
//    }
//    you can change the return-type, but it has to be a subtype of the type, the overridden method returns

    Covariant (){
        System.out.println("co");
    }

    {
        System.out.println("in");
    }

    static {
        System.out.println("st");
    }
    public static void print1(){
        System.out.println("m");
    }



}
