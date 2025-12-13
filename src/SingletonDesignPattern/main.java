package SingletonDesignPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    static void main(String[] args) {
        dbconn d1 = dbconn.getInstance();
        dbconn d2 = dbconn.getInstance();

        d1.doIncrement();
        d2.doIncrement();

        System.out.println(d1.hashCode() == d2.hashCode());
        System.out.println(d2.getIncrement());


        Runnable task = () -> {
         SingletonMultithread instance = SingletonMultithread.getInstance();
         System.out.println("Hashcode of the object: "+instance.hashCode());
        };

        ExecutorService es = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            es.submit(task);
        }
    }
}
