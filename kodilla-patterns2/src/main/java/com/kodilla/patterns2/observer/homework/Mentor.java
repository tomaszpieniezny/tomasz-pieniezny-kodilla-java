package com.kodilla.patterns2.observer.homework;
public class Mentor implements MentorObserver {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void notifyAboutNewTask(Task task) {
        System.out.println("Mentor: " + name + "! Your student " + task.getStudent().getName() +
                " has already solved exercise: " + task.getExercises().peekLast() +
                ". All task: " + task.getExercises().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}