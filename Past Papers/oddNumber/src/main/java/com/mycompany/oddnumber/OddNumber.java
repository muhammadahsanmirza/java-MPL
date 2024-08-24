package com.mycompany.oddnumber;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muhammad Ahsan
 */
class odd implements Runnable {

    String threadName;

    odd(String threadName) {
        this.threadName = threadName;
    }
    private Thread t;

    @Override
    public void run() {
        synchronized (this) {
            try {
                for (int i = 1; i <= 500; i++) {
                    if (i % 2 != 0) {
                        if (i % 9 == 0) {
                            System.out.println(this.threadName + "-->" + i);
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(odd.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    } else {
                        continue;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    void start() {
        if (t == null) {
            t = new Thread(this, this.threadName);
            t.start();
        }
    }

}

public class OddNumber {

    public static void main(String[] args) {
        odd obj1 = new odd("Thread 1");
        obj1.start();
        odd obj2 = new odd("Thread 2");
        obj2.start();
        odd obj3 = new odd("Thread 3");
        obj3.start();

    }
}
