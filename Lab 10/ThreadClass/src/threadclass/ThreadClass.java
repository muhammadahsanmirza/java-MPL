/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadclass;

/**
 *
 * @author Muhamad Ahsan
 */
class threadDemo extends Thread{
    private Thread t;
    private String threadName;
    
    threadDemo(String threadName){
        this.threadName = threadName;
        System.out.println("Creating Thread: " + this.threadName);
    }
    
    @Override
    public void run() {
        try {
                System.out.println("Executing Thread: " + this.threadName );
            for (int i = 0; i < 5; i++) {
                System.out.println("Executing Thread: " + this.threadName + "'s " + i + " iteration");
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + this.threadName + " interrupted");
        }

        System.out.println("Thread " + this.threadName + " Exiting.");
    }

    @Override
    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
    
}
public class ThreadClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        threadDemo obj1 = new threadDemo("Thread-01");
        obj1.start();
        threadDemo obj2 = new threadDemo("Thread-02");
        obj2.start();
    }
}
