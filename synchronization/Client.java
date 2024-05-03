package org.example.synchronization;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        int maxSize=6;

        Queue<Object> store=new ArrayDeque<>();

        Semaphore producers=new Semaphore(maxSize);
        Semaphore consumers=new Semaphore(0);

        Producers p1=new Producers(store,"p1",maxSize,producers,consumers);
        Producers p2=new Producers(store,"p2",maxSize,producers,consumers);
        Producers p3=new Producers(store,"p3",maxSize,producers,consumers);
        //Producers p4=new Producers(store,"p4",maxSize,producers,consumers);

        Consumers c1=new Consumers(store,"c1",maxSize,producers,consumers);
        Consumers c2=new Consumers(store,"c2",maxSize,producers,consumers);
        Consumers c3=new Consumers(store,"c3",maxSize,producers,consumers);
        //Consumers c4=new Consumers(store,"c4",maxSize,producers,consumers);

        Thread t1=new Thread(p1);
        t1.start();
        Thread t2=new Thread(p2);
        t2.start();
        Thread t3=new Thread(p3);
        t3.start();
        //Thread t4=new Thread(p4);

        Thread t5=new Thread(c1);
        t5.start();
        Thread t6=new Thread(c2);
        t6.start();
        Thread t7=new Thread(c3);
        t7.start();
        //Thread t8=new Thread(c4);



    }
}
