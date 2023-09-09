package L05.Observer;

import java.util.ArrayList;
import java.util.Random;

public class TestObserver {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        Observer observer_a = new Student();
        subject.attach(observer_a);

        Observer observer_b = new Emplo();
        subject.attach(observer_b);

        subject.sendSmsToStudent();
        subject.sendSmsToStudent();

        subject.detach(observer_a);

        subject.sendSmsToStudent();
    }
}

interface Subject {
    //The Subject interface declares a set of methods for managing subscribers.

    void attach(Observer observer);
    //Attach an observer to the subject.

    void detach(Observer observer);
    //Detach an observer from the subject.

    void notify1();
    // Notify all observers about an event.
}


interface Observer {
    //The Observer interface declares the update method, used by subjects.
    void update(ConcreteSubject subject);

    void updateToPhone(ConcreteSubject subject);

    void updateToEmail(ConcreteSubject subject);
    //Receive update from subject.
}


class ConcreteSubject implements Subject {

//    The Subject owns some important state and notifies observers when the state
//    changes.

    int _state = 0;

//    For the sake of simplicity, the Subject's state, essential to all
//    subscribers, is stored in this variable.

    ArrayList<Observer> _observers = new ArrayList<>();

//
//    List of subscribers. In real life, the list of subscribers can be stored
//    more comprehensively (categorized by event type, etc.).

    @Override
    public void attach(Observer observer) {
        System.out.println("Subject: Attached an observer.");
        _observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        _observers.remove(observer);
    }
    //The subscription management methods.


    public void notify1() {
        for (Observer observer : _observers) {
            observer.update(this);
        }

        //Trigger an update in each subscriber.
        System.out.println("Subject: Notifying observers...");
    }


    public void sendSmsToStudent() {
            /*
        Usually, the subscription logic is only a fraction of what a Subject can
        really do. Subjects commonly hold some important business logic, that
        triggers a notification method whenever something important is about to
        happen (or after it).
      */
        System.out.println("\nSubject: I'm doing something important.");

        _state = new Random().nextInt(10);
        System.out.println("Subject: My state has just changed to: " + _state);
        notify1();
    }


}

class Student implements Observer {

    private String name;
    private String LName;


    @Override
    public void update(ConcreteSubject subject) {
        if (subject._state == 0 || subject._state >= 2)
            System.out.println("ConcreteObserverB: Reacted to the event");
    }

    @Override
    public void updateToPhone(ConcreteSubject subject) {

    }

    @Override
    public void updateToEmail(ConcreteSubject subject) {

    }
}

class Emplo implements Observer {
    @Override
    public void update(ConcreteSubject subject) {
        if (subject._state == 0 || subject._state >= 2)
            System.out.println("ConcreteObserverB: Reacted to the event");
    }

    @Override
    public void updateToPhone(ConcreteSubject subject) {

    }

    @Override
    public void updateToEmail(ConcreteSubject subject) {

    }
}