package com.epam.rd.hw.patterns.task;

public class ArrayTask<T extends Comparable> {
    private T[] target;
    private SortType sortType;
    public ArrayTask(T[] target, SortType sortType) {
        this.target = target;
        this.sortType = sortType;
    }

    public T[] getTarget() {
        return target;
    }

    public SortType getSortType() {
        return sortType;
    }
}
