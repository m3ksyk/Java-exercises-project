package com.Mex;

public class Main {

    public static void main(String[] args) {
	final Worker worker1 = new Worker("worker1", true);
	final Worker worker2 = new Worker("worker2", true);

	final SharedResource sharedResource = new SharedResource(worker1);

	new Thread(new Runnable() {
        @Override
        public void run() {
            worker1.work(sharedResource, worker2);
        }
    }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker2.work(sharedResource, worker1);
            }
        }).start();

    }
}
