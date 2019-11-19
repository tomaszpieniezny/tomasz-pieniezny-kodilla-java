package com.kodilla.patterns2.observer.homework;

public interface QueueObservable {
    void registerObserver(MentorObserver mentorObserver);
    void notifyObservers();
    void removeObserver(MentorObserver mentorObserver);
}
