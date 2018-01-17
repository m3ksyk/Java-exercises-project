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
       ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);


        ExecutorService executorService = Executors.newFixedThreadPool(3);

        MyProducer producer = new MyProducer(buffer);
        MyConsumer consumer1 = new MyConsumer(buffer);
        MyConsumer consumer2 = new MyConsumer(buffer);

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
    private ArrayBlockingQueue<String> buffer;


    public MyProducer(ArrayBlockingQueue<String> buffer) {
        this.buffer = buffer;

    }

    public void run(){
        Random random = new Random();
        String[] nums = {"1","2","3","4","5"};

        for(String num: nums){
            try {
                System.out.println("adding " + num);
                buffer.put(num);


                Thread.sleep(random.nextInt(1000));

            }catch(InterruptedException e){
                System.out.println("producer interrupted");
            }
        }
        System.out.println("adding EOF, exiting");

        try {
            buffer.put("End of File");
        }catch(InterruptedException e){
            System.out.println("error");
        }

    }
}

class MyConsumer implements Runnable{
    private ArrayBlockingQueue<String> buffer;


    public MyConsumer(ArrayBlockingQueue<String> buffer) {
        this.buffer = buffer;

    }

    public void run(){
        while(true){
            synchronized (buffer){
                try{
                    if(buffer.isEmpty()){
                        continue;
                    }
                    if(buffer.peek().equals(EOF)){
                        System.out.println("Exiting");
                        break;
                    }else{
                        System.out.println("Removed " + buffer.take());
                    }

                }catch (InterruptedException e){

                }
            }


        }
    }
}