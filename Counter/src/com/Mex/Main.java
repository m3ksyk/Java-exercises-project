package com.Mex;

public class Main {

    public static void main(String[] args) {
    Countdown countdown = new Countdown();
    //    Countdown countdown1 = new Countdown();
    //    Countdown countdown2 = new Countdown();
//giving each thread its own countdown makes them iterate through the entire countdown, just like declaring an int locally inside the loop
    CountdownThread t1 = new CountdownThread(countdown);
    t1.setName("Thread 1");

    CountdownThread t2 = new CountdownThread(countdown);
    t2.setName("Thread 2");

    t1.start();
    t2.start();

    }
}

class Countdown {

    private int i;  //declaring an int here instead of inside the loop will change the resulting output.
                    // both threads will have to share the object (heap) at once this way

    //using the keyword synchronized lets both threads work without interfering with each other
    // synchronized
    public void doCountdown(){
        String color;

        switch(Thread.currentThread().getName()){
            case "Thread 1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_YELLOW;
                break;
            default:
                color = ThreadColor.ANSI_RED;
        }
        //synchronisation can be also done by just synchronising the for loop
        synchronized (this){
        for(i = 10; i>0; i--){
            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
        }}
    }

}

class CountdownThread extends Thread{
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown){
        threadCountdown = countdown;
    }
    public void run(){
        threadCountdown.doCountdown();
    }

}