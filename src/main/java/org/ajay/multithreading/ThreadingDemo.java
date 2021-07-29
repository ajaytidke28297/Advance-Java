package org.ajay.multithreading;

public class ThreadingDemo {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            Thread1 thread1 = new Thread1();
            thread1.start();

            Thread thread = new Thread(new Thread2());
            thread.start();
        }
    }
}
