package com.epam.rd.hw.patterns.core;

import com.epam.rd.hw.patterns.task.ArrayTask;
import com.epam.rd.hw.patterns.task.SortType;
import com.epam.rd.hw.patterns.task.SortTypeFactory;

public class TaskProducer {
    private Pipeline pipeline;

    public TaskProducer(Pipeline pipeline) {
        this.pipeline = pipeline;
    }

    public void generateTask() throws InterruptedException {
        Integer[] array = createRandomArray();
        SortType sortType = SortTypeFactory.getSortType(array.length);

        pipeline.putTask(new ArrayTask<Integer>(array, sortType));
    }

    //TODO: implement method
    private Integer[] createRandomArray() {
        return null;
    }
}
