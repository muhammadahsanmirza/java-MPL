/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsynchronization;

/**
 *
 * @author Muhammad Ahsan
 */
class PrintDemo {

    public void printCount() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Counter   ---   " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}

class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;
    PrintDemo PD;

    ThreadDemo(String name, PrintDemo pd) {
        threadName = name;
        PD = pd;
    }

    @Override
    public void run() {
        synchronized (PD) {
            PD.printCount();
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class ThreadSynchronization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        PrintDemo PD = new PrintDemo();

        ThreadDemo T1 = new ThreadDemo("Thread - 1 ", PD);
        ThreadDemo T2 = new ThreadDemo("Thread - 2 ", PD);

        T1.start();
        T2.start();
        try {
            T1.join();
            T2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }

    }
}
