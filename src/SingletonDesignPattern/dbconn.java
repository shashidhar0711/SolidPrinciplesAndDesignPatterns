package SingletonDesignPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class dbconn {
    private static dbconn instance = null;
    public int c = 0;
    static Lock l = new ReentrantLock();

    private dbconn() {}

    public static dbconn getInstance() {
        if (instance == null) {
            l.lock();
            if (instance == null) {
                instance = new dbconn();
            }
            l.unlock();
        }
        return instance;
    }

    public void doIncrement() {
        c += 1;
    }

    public int getIncrement() {
        return c;
    }

}
