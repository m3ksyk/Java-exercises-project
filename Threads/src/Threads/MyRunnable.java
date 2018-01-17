package Threads;

import static Threads.ThreadColor.ANSI_PURPLE;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_PURPLE + "runnable thread here");
    }
}
