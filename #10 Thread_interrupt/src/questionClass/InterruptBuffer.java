package questionClass;

/**
 * Created on 11.08.17.
 */
public class InterruptBuffer {
    private ThreadNode producers = null;
    private ThreadNode consumers = null;
    private Integer elem = null;

    public synchronized void put (int newElem) {
        while (elem != null) {
            try{
                //? добавление самого себя в очередь продюсеров;//
                producers = new ThreadNode(Thread.currentThread(), producers);
                this.wait();
            } catch (InterruptedException e) {
                //NOP
            }
        }
        elem = newElem;
        if (consumers != null) {
            consumers.value.interrupt();
            consumers = consumers.next;
            //?//
        }
    }
    public synchronized int get () {
        while (elem == null) {
            try {
                //?//
                consumers = new ThreadNode(Thread.currentThread(), consumers);
                this.wait();
            } catch (InterruptedException e ) {
                //NOP
            }
        }
        int result = elem;
        elem = null;
        if(producers != null) {
            producers.value.interrupt();
            producers = producers.next;
            //?
        }
        return  result;
    }
}
