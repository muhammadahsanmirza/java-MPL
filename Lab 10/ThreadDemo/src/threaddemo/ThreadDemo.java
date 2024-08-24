/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;

/**
 *
 * @author Muhammad Ahsan
 */
class multiThreading implements Runnable {

    private Thread t;
    private String threadName;

    public multiThreading(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating Thread: " + this.threadName);
    }

    @Override
    public void run() {
        try {

            for (int i = 0; i < 5; i++) {
                System.out.println("Executing Thread: " + this.threadName + "'s " + i + " iteration");
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + this.threadName + " interrupted");
        }

        System.out.println("Thread " + this.threadName + " Exiting.");
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        multiThreading obj1 = new multiThreading("Thread One");
        obj1.start();
        multiThreading obj2 = new multiThreading("Thread Two");
        obj2.start();
    }
}
