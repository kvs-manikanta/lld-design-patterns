package org.example.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
public class MergeSort implements Callable<List<Integer>>  {
    List<Integer> sortToList;
    ExecutorService executorService;

    MergeSort(List<Integer> sortToList , ExecutorService executorService)
    {
        this.executorService=executorService;
        this.sortToList=sortToList;
    }

    @Override
    public List<Integer> call() throws Exception {
        int n=sortToList.size();
        if(n<=1)
        {
            return sortToList;
        }

        List<Integer> leftList=new ArrayList<>();
        List<Integer> rightList=new ArrayList<>();

        for(int i=0;i<n/2;i++)
        {
            leftList.add(sortToList.get(i));
        }

        for(int i=n/2;i<n;i++)
        {
            rightList.add(sortToList.get(i));
        }

        MergeSort leftMergeSort=new MergeSort(leftList,executorService);
        MergeSort rightMergeSort=new MergeSort(rightList, executorService);

        Future<List<Integer>> leftSortedListFuture=executorService.submit(leftMergeSort);
        Future<List<Integer>> rightSortedListFuture=executorService.submit(rightMergeSort);

        List<Integer> leftSortedList=leftSortedListFuture.get();
        List<Integer> rightSortedList=rightSortedListFuture.get();

        int i=0;
        int j=0;

        List<Integer> finalSortedList=new ArrayList<>();

        while(i<leftSortedList.size() && j<rightSortedList.size())
        {
            if(leftSortedList.get(i)<rightSortedList.get(j))
            {
                finalSortedList.add(leftSortedList.get(i));
                i++;
            }
            else
            {
                finalSortedList.add(rightSortedList.get(j));
                j++;
            }
        }

        while (i < leftSortedList.size()) {
            finalSortedList.add(leftSortedList.get(i));
            i++;
        }

        while (j < rightSortedList.size()) {
            finalSortedList.add(rightSortedList.get(j));
            j++;
        }

        return finalSortedList;
    }
}
