/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadingexample;

/**
 *
 * @author Muhammad Ahsan
 */
class randomNumber implements Runnable {
    private int number;
    private Thread th;

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                this.number = (int) (Math.random() * 100 + 1);
                if (number % 2 == 0) {
                    Thread t = new Thread(new cubeCalculator(this.number));
                    t.start();
                }else{
                    Thread t = new Thread(new squareCalculator(this.number));
                    t.start();
                }
                Thread.sleep(1000);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    void start(){
        if(th==null){
            th = new Thread(this);
            th.start();
        }
    }
}

class squareCalculator implements Runnable{

    private int number;

    squareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int square = this.number * this.number;
        System.out.println("Square of " + this.number + " = " + square);
    }
}

class cubeCalculator implements Runnable {

    private int number;

    cubeCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + this.number + " is = " + cube);

    }
}

public class MultiThreadingExample {

    public static void main(String[] args) {
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        // TODO code application logic here
        System.out.println("Thread 1 creating.....");
        randomNumber r1 = new randomNumber();
        r1.start();
    }
}
