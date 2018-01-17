package Threads;

import static Threads.ThreadColor.ANSI_BLUE;
import static Threads.ThreadColor.ANSI_GREEN;

public class Main
{
    public static void main(String[] args) {
        System.out.println(ANSI_BLUE + "main thread here");

        Thread otherThread = new OtherThread();
        otherThread.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "anonymous class thread here");
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e){
                    System.out.println("another thread woke me up");
                    return;
                }
            }
        }.start();

            Thread myRunnableThread = new Thread(new MyRunnable(){
                @Override
                public void run() {
                    System.out.println("anonymous class implementation runnable thread here");
                    try{
                        otherThread.join();
                        System.out.println("threads joined");
                    }catch(InterruptedException e){
                        System.out.println("got interrupted");
                    }
                }
            });
            myRunnableThread.start();


        System.out.println(ANSI_BLUE + "main thread here again");
    }
}
