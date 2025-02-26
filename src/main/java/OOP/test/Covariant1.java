package OOP.test;

import javax.xml.namespace.QName;

public class Covariant1  {



    private String name;



//    public float add(){
//        float a=10,b=30;
//        return a+b;
//    }

//    public short add(){

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//        short a=10,b=5;
//        return (short) (a+b);
//    }

//    public String add(){
//        return "dhaval";
//    }

    public  void print(){

        System.out.println("fff");
    }
    public  Covariant covariant(Covariant a){
        return a;
    }
}
