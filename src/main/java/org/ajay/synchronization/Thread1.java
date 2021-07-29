package org.ajay.synchronization;

public class Thread1 extends Thread{
    MathUtils mathUtils;

    public Thread1 (MathUtils mathUtils) {
        this.mathUtils = mathUtils;
    }

    @Override
    public void run() {
        try {
            mathUtils.getMultiples(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
