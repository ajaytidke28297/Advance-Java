package org.ajay.multithreading;

public class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread1 is running");
        }catch (Exception e) {
            System.out.println("Exception raise: " + e);
        }
    }
}
