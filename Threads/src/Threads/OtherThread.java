package Threads;

import static Threads.ThreadColor.ANSI_CYAN;

public class OtherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_CYAN + "Other thread here");
    }
}
