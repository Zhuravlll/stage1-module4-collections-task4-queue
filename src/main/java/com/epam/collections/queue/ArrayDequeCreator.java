package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
            for (int i = 0; i < 2; i++) {
                result.add(Objects.requireNonNull(firstQueue.poll()));
            }
            for (int k = 0; k < 2; k++) {
                result.add(Objects.requireNonNull(secondQueue.poll()));
        }
        while (firstQueue.iterator().hasNext() && secondQueue.iterator().hasNext()) {
            firstQueue.add(result.pollLast());
            for (int j = 0; j < 2; j++) {
                result.addLast(Objects.requireNonNull(firstQueue.poll()));
            }
            secondQueue.add(result.pollLast());
            for (int l = 0; l < 2; l++) {
                result.addLast(Objects.requireNonNull(secondQueue.poll()));
            }
        }
        return result;
    }
}
