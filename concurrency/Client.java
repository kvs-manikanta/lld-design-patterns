package org.example.concurrency;

import javax.crypto.spec.PSource;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> list=List.of(9,4,7,2,6,1,8,5);
        ExecutorService executorService= Executors.newCachedThreadPool();

        MergeSort mergeSort=new MergeSort(list,executorService);

        Future<List<Integer>> sortedList=executorService.submit(mergeSort);

        List<Integer> finalList=sortedList.get();
        System.out.println("Final sorted list");

        for (Integer integer : finalList) {
            System.out.print(integer+" ");
        }
    }
}
