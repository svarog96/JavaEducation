package part1;

/**
 * Created on 05.08.17.
 */
public class ThreadExample_3B {
    public static void main(String[] args) throws InterruptedException {
        final Thread mainThread = Thread.currentThread();
        Thread runThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println("Run: wait for main");
                    mainThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        runThread.start();

        System.out.println("Main: wait  for run!");
        runThread.join();
    }
}
