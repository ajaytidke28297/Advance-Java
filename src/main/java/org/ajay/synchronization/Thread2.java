package org.ajay.synchronization;

public class Thread2 implements Runnable {
    MathUtils mathUtils;

    public Thread2(MathUtils mathUtils) {
        this.mathUtils = mathUtils;
    }

    @Override
    public void run() {
        try {
            mathUtils.getMultiples(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
