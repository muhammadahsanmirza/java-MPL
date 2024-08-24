/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numberguessing;

/**
 *
 * @author Laptop links2
 */
class displayMessage implements Runnable {

    private String message;

    public displayMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        int i=0;
        while (i<1) {
            System.out.println(this.message);
            i++;
        }
    }
}

class guessNumber extends Thread {

    private int number;

    guessNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int counter = 0;
        int guess = 0;
        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + "    guesses    ");
            counter++;
        } while (guess != number);
        System.out.println("**  Correct!" + this.getName() + " in " + counter + " guesses");
    }
}

public class NumberGuessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        Runnable hello = new displayMessage("Hello");
        Thread thread1 = new Thread(hello);
        thread1.setName("hello");
        System.out.println("Starting hello thread");
        thread1.start();
        Runnable bye = new displayMessage("GoodBye");
        Thread thread2 = new Thread(bye);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setDaemon(true);
        System.out.println("Starting Good Bye thread");
        thread2.start();
        System.out.println("Starting thread3......");
        Thread thread3 = new guessNumber(27);
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Exception Occured");
        }
        System.out.println("Starting thread3......");
        Thread thread4 = new guessNumber(75);
        thread4.start();

        System.out.println("main() is ending.....");
    }
}
