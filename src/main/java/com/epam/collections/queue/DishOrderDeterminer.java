package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> tempHolding = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            tempHolding.add(i);
        }
        List<Integer> result = new LinkedList<>();
        int dishCounter = 0;
        while (!tempHolding.isEmpty()) {
            dishCounter += everyDishNumberToEat - 1;
            if (dishCounter >= tempHolding.size()) {
                dishCounter = dishCounter % tempHolding.size();
            }
            result.add(tempHolding.remove(dishCounter));
        }
        return result;
    }
}
