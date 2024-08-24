/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsleep;

/**
 *
 * @author Muhammad Ahsan
 */
class testThread implements Runnable {

    private String threadName;
    private Thread t;

    testThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Thread executing with the name: " + t.getName());
                Thread.sleep(3000);
                t.setName("Ahsan");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    void start(){
        if (t == null){
            t = new Thread(this,this.threadName);
            t.start();
        }
    }
}

public class ThreadSleep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        testThread tt = new testThread("Hassan");
        tt.start();
    }
}
