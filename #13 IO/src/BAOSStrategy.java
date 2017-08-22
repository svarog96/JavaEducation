import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 17.08.17.
 */
public class BAOSStrategy extends OutputStream {
    private static final int DEFAULT_START_SIZE = 16;
    private static final AllocateStrategy DEFAULT_ALLOCATE_STRATEGY = new DoubleAllocateStrategy();
    private final AllocateStrategy strategy;
    private List<byte[]> bufferList = new ArrayList<>(16);
    private int count = 0;

    public BAOSStrategy(){
        this(DEFAULT_START_SIZE, DEFAULT_ALLOCATE_STRATEGY);
    }
    public BAOSStrategy(int startSize) {
        this(startSize, DEFAULT_ALLOCATE_STRATEGY);
    }
    public BAOSStrategy(AllocateStrategy strategy) {
        this(DEFAULT_START_SIZE, strategy);
    }
    public BAOSStrategy(int startSize, AllocateStrategy strategy) {
        bufferList.add(new byte[startSize]);
        this.strategy = strategy;
    }


    @Override
    public void write(int b) throws IOException {
        byte[] lastBuff = bufferList.get(bufferList.size() - 1);
        if (count == lastBuff.length) {
            int newSize = strategy.nextAfter(lastBuff.length);
            byte[] newLastBuff = new byte[newSize];
            bufferList.add(newLastBuff);
            count = 0;
            lastBuff = newLastBuff;
        }
        lastBuff[count++] = (byte) b;
    }

    @Override
    public void write(byte[] b) throws IOException {
        //todo:realize
       throw new UnsupportedEncodingException();
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        //todo realize me
        throw new UnsupportedEncodingException();
    }
}
