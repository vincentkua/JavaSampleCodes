package ref;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadRead {

    public static void main(String[] args) {

        // for (int i = 0; i < 5; i++) {
        // MultiThreadClass multiexample = new MultiThreadClass(i);
        // Thread myThread = new Thread(multiexample);
        // myThread.start();

        // // MultiThreadClass multiexample = new MultiThreadClass(i);
        // // multiexample.start();
        // }

        MultiThreadClass mt1 = new MultiThreadClass(1);
        MultiThreadClass mt2 = new MultiThreadClass(2);
        MultiThreadClass mt3 = new MultiThreadClass(3);
        MultiThreadClass mt4 = new MultiThreadClass(4);
        MultiThreadClass mt5 = new MultiThreadClass(5);

        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(mt1);
        executorService.submit(mt2);
        executorService.submit(mt3);
        executorService.submit(mt4);
        executorService.submit(mt5);
        executorService.shutdown();



    }

}
