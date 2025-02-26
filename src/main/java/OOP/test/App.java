package OOP.test;

public class App {

    public static void main(String[] args) {
        int n= 5;

        for(int i=n;i>=1;i--){

            for (int j=n;j>=1;j--){

                for (int k=1;k<=i;k++) {
                    System.out.print(j);
                }
            }
            System.out.println(" ");
        }
    }
}
