package ref;

public class MultiThreadClass implements Runnable {
    private int threadnum;
    public MultiThreadClass(int threadnum) {
        this.threadnum = threadnum;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread #" + threadnum + " Running " + (i+1) + "/5");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

// public class MultiThreadClass extends Thread {
//     private int threadnum;
//     public MultiThreadClass(int threadnum) {
//         this.threadnum = threadnum;
//     }

//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println(i + " - from thread #" + threadnum);
//             try {
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

