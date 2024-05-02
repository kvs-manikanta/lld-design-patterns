package org.example.synchronization;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producers implements Runnable{

    Queue<Object> store;
    String name;
    int maxSize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Producers(Queue<Object> store , String name , int maxSize, Semaphore producerSemaphore , Semaphore consumerSemaphore )
    {
        this.store=store;
        this.name=name;
        this.maxSize=maxSize;
        this.producerSemaphore=producerSemaphore;
        this.consumerSemaphore=consumerSemaphore;
    }

    @Override
    public void run() {
        while(true)
        {
            try
            {
                producerSemaphore.acquire();
            }
            catch (InterruptedException ie)
            {
                throw new RuntimeException(ie);
            }
            if(store.size()<maxSize)
            {
                System.out.println("Producer: " + this.name + " is producing, store size = " + store.size());
                System.out.println("Thread :" +Thread.currentThread().getName());
                store.add(new Object());
                consumerSemaphore.release();
            }
        }
    }
}
