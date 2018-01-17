package com.Mex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

import static com.Mex.Main.EOF;

public class Main {

public static final String EOF = "EOF";

    public static void main(String[] args) {
        List<String> buffer = new ArrayList<String>();
        ReentrantLock bufferLock = new ReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        MyProducer producer = new MyProducer(buffer, bufferLock);
        MyConsumer consumer1 = new MyConsumer(buffer, bufferLock);
        MyConsumer consumer2 = new MyConsumer(buffer, bufferLock);

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Printed from the callable class");
                return "This is callable result";
            }
    });
        try {
            System.out.println(future.get());
        }catch(ExecutionException e){
            System.out.println("Stuff went south, something is wrong");
        }catch(InterruptedException e){
            System.out.println("thread running tsk was interrupted");
        }

        executorService.shutdown();

      //  new Thread(producer).start();
      //  new Thread(consumer1).start();
      //  new Thread(consumer2).start();
    }
}

class MyProducer implements Runnable {
    private List<String> buffer;
    private ReentrantLock bufferLock;

    public MyProducer(List<String> buffer, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.bufferLock = bufferLock;
    }

    public void run(){
        Random random = new Random();
        String[] nums = {"1","2","3","4","5"};

        for(String num: nums){
            try {
                System.out.println("adding " + num);
                bufferLock.lock();
                try{
                    buffer.add(num);
                }finally {
                    bufferLock.unlock();
                }


                Thread.sleep(random.nextInt(1000));

            }catch(InterruptedException e){
                System.out.println("producer interrupted");
            }
        }
        System.out.println("adding EOF, exiting");
        bufferLock.lock();
        try {
            buffer.add("End of File");
        }finally {
            bufferLock.unlock();
        }

    }
}

class MyConsumer implements Runnable{
    private List<String> buffer;
    private ReentrantLock bufferLock;

    public MyConsumer(List<String> buffer, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.bufferLock = bufferLock;
    }

    public void run(){
        while(true){
            bufferLock.lock();
            try{
                if(buffer.isEmpty()){
                    continue;
                }
                if(buffer.get(0).equals(EOF)){
                    System.out.println("Exiting");
                    break;
                }else{
                    System.out.println("Removed " + buffer.remove(0));
                }

            }finally {
                bufferLock.unlock();
            }

        }
    }
}