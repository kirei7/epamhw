package com.epam.rd.hw.patterns.task;

public class SortTypeFactory {
    public static SortType getSortType(int arraySize) {
        if (arraySize <= 0 || arraySize > 10000) throw new IllegalArgumentException("Array size out of bounds [1,10000]");
        if (arraySize % 2 == 0)
            return SortType.NOSORT;
        if (arraySize <= 10 )
            return SortType.INSERTION_SORT;
        if (arraySize <= 100)
            return SortType.BUBBLE_SORT;
        else
            return SortType.QUICKSORT;
    }
}
