package com.Mex;

import java.util.concurrent.locks.ReentrantLock;

//thread starvation and fair lock  exercise

//thread starvation

//public class Main {
//    public static Object lock = new Object();
//
//    public static void main(String[] args) {
//
//        Thread t1 = new Thread(new Worker(ThreadColor.ANSI_RED), " Thread priority 10");
//        Thread t2 = new Thread(new Worker(ThreadColor.ANSI_BLUE), " Thread priority 8");
//        Thread t3 = new Thread(new Worker(ThreadColor.ANSI_GREEN), " Thread priority 6");
//        Thread t4 = new Thread(new Worker(ThreadColor.ANSI_CYAN), " Thread priority 4");
//        Thread t5 = new Thread(new Worker(ThreadColor.ANSI_PURPLE), " Thread priority 2");
//
//        t1.setPriority(10);
//        t2.setPriority(8);
//        t3.setPriority(6);
//        t4.setPriority(4);
//        t5.setPriority(2);
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//
//    }
//    private static class Worker implements Runnable{
//        private int runCount = 1;
//        private String threadColor;
//
//        public Worker(String threadColor) {
//            this.threadColor = threadColor;
//        }
//
//        @Override
//        public void run() {
//            for(int i=0; i<100; i++){
//                synchronized (lock){
//                    System.out.format(threadColor + "%s: runCount = %d\n", Thread.currentThread().getName(), runCount++);
//                    //execute critical section of the code
//                }
//            }
//        }
//    }
//}



// fair lock

public class Main {
    public static ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {

        Thread t1 = new Thread(new Worker(ThreadColor.ANSI_RED), " Thread priority 10");
        Thread t2 = new Thread(new Worker(ThreadColor.ANSI_BLUE), " Thread priority 8");
        Thread t3 = new Thread(new Worker(ThreadColor.ANSI_GREEN), " Thread priority 6");
        Thread t4 = new Thread(new Worker(ThreadColor.ANSI_CYAN), " Thread priority 4");
        Thread t5 = new Thread(new Worker(ThreadColor.ANSI_PURPLE), " Thread priority 2");

        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(6);
        t4.setPriority(4);
        t5.setPriority(2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
    private static class Worker implements Runnable{
        private int runCount = 1;
        private String threadColor;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }

        @Override
        public void run() {
            for(int i=0; i<100; i++){
                lock.lock();
                try{
                    System.out.format(threadColor + "%s: runCount = %d\n", Thread.currentThread().getName(), runCount++);
                    //execute critical section of the code
                }finally {
                    lock.unlock();
                }
            }
        }
    }
}
