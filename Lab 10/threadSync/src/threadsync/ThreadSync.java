/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsync;

/**
 *
 * @author Muhammad Ahsan
 */
class authenticate {

    void login() {
        System.out.println("Requesting login...");
        try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    void verifyInfo() {
        System.out.println("Verifying info...");
        try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    void access() {
        System.out.println("Granting Access...");
        try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}

public class ThreadSync implements Runnable {

    authenticate a = new authenticate();

    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Thread t = new Thread(new ThreadSync());
        Thread t2 = new Thread(new ThreadSync());
        t.start();
        t2.start();
        
                
    }

    @Override
    public void run() {
        synchronized (a) {
            a.login();
            a.verifyInfo();
            a.access();
        }

    }
}
