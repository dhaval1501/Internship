package OOP.test;

interface MultiIF {
    default void display(){
        System.out.println("Dhaval");
    }

    public static void main(String[] args) {
        FinalStaticM f= new FinalStaticM();
        System.out.println(f.a=11);
    }

}
