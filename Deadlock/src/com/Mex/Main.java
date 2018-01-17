package com.Mex;

import static com.Mex.Main.lock1;
import static com.Mex.Main.lock2;

public class Main {
// now the it runs properly,
// but if thread 2 has lock 2 and waits for lock1,
// and thread 1 has lock 1 and waits for lock 2,
// then there is a deadlock
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
	new Thread1().start();
	new Thread2().start();
    }
}
 class Thread1 extends Thread{
    public void run() {
        synchronized (lock1){
            System.out.println("thread 1   lock 1");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){

            }
            System.out.println("Thread 1 waiting for lock 2");
            synchronized (lock2){
                System.out.println("thread 1 lock1 and lock 2");
            }
            System.out.println("Thread 1 : lock 2 released");
        }
        System.out.println("Thread 1 : lock 1 released. Exiting");
    }
}

class Thread2 extends Thread{
    public void run() {
        synchronized (lock1){
            System.out.println("thread 2   lock 1");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){

            }
            System.out.println("Thread 2 waiting for lock 2");
            synchronized (lock2){
                System.out.println("thread 2 lock1 and lock 2");
            }
            System.out.println("Thread 2 : lock 2 released");
        }
        System.out.println("Thread 2 : lock 1 released. Exiting");
    }
}