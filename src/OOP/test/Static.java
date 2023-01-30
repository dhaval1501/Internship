package OOP.test;

public class Static {
    int count1=0;
    static int count=0;
    public void increment()
    {
        count1++;
        count++;
    }
    public static void main(String args[])
    {
        Static obj1=new Static();
        Static obj2=new Static();

        obj1.increment();
        System.out.println(obj1.count+","+obj1.count1);

        obj2.increment();
        System.out.println(obj2.count+","+obj2.count1);

        obj1.increment();
        System.out.println(obj1.count+","+obj1.count1);
    }
}
