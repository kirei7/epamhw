package com.epam.rd.hw.patterns.core;

import com.epam.rd.hw.patterns.task.ArrayTask;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Pipeline {
    private BlockingQueue<ArrayTask> queue = new ArrayBlockingQueue<>(1024);
    private List<TaskConsumer> consumers = new ArrayList<>();

    public void putTask(ArrayTask task) throws InterruptedException {
        queue.add(task);
        if (queue.size() == 1)
            notifyConsumers();
    }
    public ArrayTask takeTask() throws InterruptedException {
        return queue.take();
    }

    public void registerConsumer(TaskConsumer consumer) {
        consumers.add(consumer);
    }

    private void notifyConsumers() throws InterruptedException {
        for (TaskConsumer consumer : consumers) {
            consumer.consume(this);
        }
    }
}
