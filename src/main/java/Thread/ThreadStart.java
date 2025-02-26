package Thread;

public class ThreadStart {

    public static void main(String[] args) {

        ThreadPractice threadPractice=new ThreadPractice();
        Thread t=new Thread(threadPractice);

        t.start();
        
    }
}
