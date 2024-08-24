package com.mycompany.multithread;

import java.util.Scanner;

/**
 *
 * @author Muhammad Ahsan
 */
public class Multithread extends Thread {

    static int count = 0;
    static int sum = 0;
    static int num;
    static Thread th;

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        th = new Thread(new Multithread());
        th.start();
        for (int i = 1; i <= 5; i++) {
            String str = scr.next();
            sum = sum + num;
            count++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("your points: " + sum);
        if (sum > 300) {
            System.out.println("you win!!!");
        } else {
            System.out.println("you lose!!!");
        }
    }

    @Override
    public void run() {
//        for (int i=0;i<1;i++) {
        for (;;) {
            num = (int) (Math.random() * 100);
            System.out.println(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            if (count == 5) {
                break;
            }
        }
    }

}
