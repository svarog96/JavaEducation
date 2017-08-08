/**
 * Created on 07.08.17.
 */
public class BlockedSetExample {

    public static void main(String[] args) {
        BlockedSetExample ref = new BlockedSetExample();
        for(int k = 0; k < 5; k++) {
            new Thread(new BlockedMethodCaller(ref, k)).start();
        }
    }
    public /* synchronized*/ void f(int x) throws InterruptedException {
        System.out.println("+" + x);
        Thread.sleep(1000);
//        this.wait();
        System.out.println("-" + x);
    }
}
