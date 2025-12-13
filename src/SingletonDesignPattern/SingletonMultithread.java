package SingletonDesignPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonMultithread {
    private static SingletonMultithread Instance = null;
        static Lock l = new ReentrantLock();
    SingletonMultithread() {

    }

    public static SingletonMultithread getInstance() {
        if (Instance == null) {
            l.lock();
            if (Instance == null) {
                Instance = new SingletonMultithread();
            }
            l.unlock();
        }
        return  Instance;
    }

}
