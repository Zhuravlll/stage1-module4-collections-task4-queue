package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        ListComparator listComparator = new ListComparator();
        PriorityQueue<String> myQueue = new PriorityQueue<>(listComparator);
        myQueue.addAll(firstList);
        myQueue.addAll(secondList);
        return myQueue;
    }
}

class ListComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.equals(o2)) {
            return 0;
        }
        if (o1.compareTo(o2) > 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
