package OOP.test;

public class FinalStaticM1 extends FinalStaticM{

     static void display(){
        System.out.println("Dhari");
    }
    @Override
    void disply(){
        System.out.println("Patel");
    }

    public static void main(String[] args) {
       display();
       FinalStaticM.display();

        FinalStaticM fs=new FinalStaticM();
        FinalStaticM1 fs1=new FinalStaticM1();

        fs.disply();
        fs1.disply();

    }
}
