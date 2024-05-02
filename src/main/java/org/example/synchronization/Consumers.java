package org.example.synchronization;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumers implements Runnable{

    Queue<Object> store;
    String name;
    int maxSize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Consumers(Queue<Object> store , String name , int maxSize, Semaphore producerSemaphore , Semaphore consumerSemaphore )
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
                consumerSemaphore.acquire();
            }
            catch (InterruptedException ie)
            {
                throw new RuntimeException(ie);
            }
            System.out.println("consumer: " + this.name + " is consuming, store size = " + store.size());
            System.out.println("Thread :" +Thread.currentThread().getName());
            store.remove();
            producerSemaphore.release();

        }
    }
}
