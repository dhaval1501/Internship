package Thread;

public class ThreadPractice  implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
