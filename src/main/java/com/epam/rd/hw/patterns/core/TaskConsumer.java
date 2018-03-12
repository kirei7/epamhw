package com.epam.rd.hw.patterns.core;

import com.epam.rd.hw.patterns.algorithm.AlgorithmFactory;
import com.epam.rd.hw.patterns.algorithm.SortAlgorithm;
import com.epam.rd.hw.patterns.task.ArrayTask;

public class TaskConsumer {
    public void consume(Pipeline pipeline) throws InterruptedException {
        while (true) {
            ArrayTask task = pipeline.takeTask();
            SortAlgorithm algorithm = AlgorithmFactory.getAlgorithm(task.getSortType());
            algorithm.sort(task.getTarget());
        }
    }
}
