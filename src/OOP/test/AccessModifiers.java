package OOP.test;

public class AccessModifiers {

    public void display(){
        System.out.println("public method");
    }

    protected void display1(){
        System.out.println("protected method");
    }

     void display2(){
         System.out.println("default method");
    }

    private void display3(){
        System.out.println("private method");
    }

    public static void main(String[] args) {
        AccessModifiers am=new AccessModifiers();
        am.display();
        am.display1();
        am.display2();
        am.display3();

    }

}
