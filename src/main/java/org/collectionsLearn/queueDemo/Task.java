package org.collectionsLearn.queueDemo;

public class Task {
    private String name;
    private Integer priority;

    public Task(String name, int priority){
        this.name = name;
        this.priority = priority;
    }

    public String getName(){
        return this.name;
    }

    public Integer getPriority(){
        return this.priority;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + '}';
    }
}
