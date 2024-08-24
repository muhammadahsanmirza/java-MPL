/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrentthreads;

/**
 *
 * @author Muhammad Ahsan
 */
class userThread implements Runnable {

    private Thread t;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("User thread: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("User thread completed.");
    }

    void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}

public class ConcurrentThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        userThread ut = new userThread();
        ut.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main thread completed.");
    }
}
