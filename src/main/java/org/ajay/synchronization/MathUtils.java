package org.ajay.synchronization;

public class MathUtils {

    //synchronized void getMultiples(int n) { for method synchronization
    void getMultiples(int n) {

        //Synchronize the required block only instead of synchronizing the whole method.
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
