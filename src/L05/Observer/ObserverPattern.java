package L05.Observer;

import java.util.ArrayList;
import java.util.Random;

public class ObserverPattern {
    static Random rd = new Random();

    public static void main(String[] args) {
        IObserverSystem ObMSG = new msgObserverSystem();
        person[] people = new person[rd.nextInt(100)];
        for (int i = 0; i < people.length; i++) {
            switch (rd.nextInt(4)) {
                case 0:
                    people[i] = new student("-" + i, "last_name-" + i, (float)rd.nextInt(120), "333" + i, (rd.nextInt(2) == 0) ? 'M' : 'F');
                    break;
                case 1:
                    people[i] = new employee("-" + i, "last_name-" + i, rd.nextInt(120), "333" + i, (rd.nextInt(2) == 0) ? 'M' : 'F');
                    break;
                case 2:
                    people[i] = new customer("-" + i, "last_name-" + i, rd.nextInt(120), "333" + i, (rd.nextInt(2) == 0) ? 'M' : 'F');
                    break;
                case 3:
                    people[i] = new supplier("-" + i, "last_name-" + i, rd.nextInt(120), "333" + i, (rd.nextInt(2) == 0) ? 'M' : 'F');
                    break;
            }
        }
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
        System.out.println("Before");
        System.out.println(ObMSG);
        for (int i = 0; i < people.length; i++) {
            ObMSG.attach(people[i]);
        }
        System.out.println("After");
        System.out.println(ObMSG);

        ObMSG.notifyMsg(0);



    }
}

class msgObserverSystem implements IObserverSystem {

    private ArrayList<IObserver> _observer;

    public msgObserverSystem() {
        this._observer = new ArrayList<>();
    }

    @Override
    public void attach(IObserver observer) {
        _observer.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        _observer.remove(observer);
    }

    @Override
    public void notifyMsg(int mode) {
        switch (mode) {

            case 0:
                for (IObserver obj : _observer) {
                    obj.update(this);
                }
                break;
            case 1:
                for (IObserver obj : _observer) {
                    obj.updateToEmail(this);
                }
                break;
            case 2:
                for (IObserver obj : _observer) {
                    obj.updateToPhone(this);
                }
                break;
            default:
                System.out.println("Invalid argument");
                break;
        }
    }

    public void sendSmsToStudent() {
            /*
        Usually, the subscription logic is only a fraction of what a Subject can
        really do. Subjects commonly hold some important business logic, that
        triggers a notification method whenever something important is about to
        happen (or after it).
      */
        System.out.println("\nSubject: I'm doing something important. Student");
        System.out.println("Subject: My state has just changed to: ");

    }

    public void sendSmsToEmployee() {
            /*
        Usually, the subscription logic is only a fraction of what a Subject can
        really do. Subjects commonly hold some important business logic, that
        triggers a notification method whenever something important is about to
        happen (or after it).
      */
        System.out.println("\nSubject: I'm doing something important Employee .");
        System.out.println("Subject: My state has just changed to: ");

    }

    @Override
    public String toString() {
        return "msgObserverSystem{" +
                "_observer=" + _observer +
                '}';
    }
}

class ObserverSystem implements IObserverSystem {


    @Override
    public void attach(IObserver observer) {

    }

    @Override
    public void detach(IObserver observer) {

    }

    @Override
    public void notifyMsg(int mode) {

    }
}

interface IObserverSystem {

    void attach(IObserver observer);
    //Attach an observer to the subject.

    void detach(IObserver observer);
    //Detach an observer from the subject.

    void notifyMsg(int mode);
    // Notify all observers about an event.
}

interface IObserver {

    //The Observer interface declares the update method, used by subjects.
    void update(msgObserverSystem subject);

    void updateToPhone(msgObserverSystem subject);

    void updateToEmail(msgObserverSystem subject);
    //Receive update from subject.
}

abstract class person implements IObserver {

    private String name;
    private String lastName;
    private float age;
    private String ID;
    private char gender;

    public person(String name, String lastName, float age, String ID, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public void update(msgObserverSystem subject) {
        System.out.println("update");
    }

    @Override
    public void updateToPhone(msgObserverSystem subject) {
        System.out.println("updateToPhone");
    }

    @Override
    public void updateToEmail(msgObserverSystem subject) {
        System.out.println("updateToEmail");
    }

    @Override
    public String toString() {
        return "name ->" + name +" lastName -> " + lastName +   " age -> " + age +  " gender -> " + gender + " ID -> " + ID ;
    }
}

class student extends person {
    public student(String name, String lastName, float age, String ID, char gender) {
        super(name, lastName, age, ID, gender);
    }

    @Override
    public void update(msgObserverSystem subject) {

        subject.sendSmsToStudent();
    }

    @Override
    public void updateToPhone(msgObserverSystem subject) {
        System.out.println("updateToPhone");
    }

    @Override
    public void updateToEmail(msgObserverSystem subject) {
        System.out.println("updateToEmail");
    }


}

class employee extends person {
    public employee(String name, String lastName, float age, String ID, char gender) {
        super(name, lastName, age, ID, gender);
    }

    @Override
    public void update(msgObserverSystem subject) {
        subject.sendSmsToEmployee();
    }

    @Override
    public void updateToPhone(msgObserverSystem subject) {

    }

    @Override
    public void updateToEmail(msgObserverSystem subject) {

    }
}

class supplier extends person {

    public supplier(String name, String lastName, float age, String ID, char gender) {
        super(name, lastName, age, ID, gender);
    }

    @Override
    public void update(msgObserverSystem subject) {System.out.println("Hello supplier"); }

    @Override
    public void updateToPhone(msgObserverSystem subject) {

    }

    @Override
    public void updateToEmail(msgObserverSystem subject) {

    }
}

class customer extends person {

    public customer(String name, String lastName, float age, String ID, char gender) {
        super(name, lastName, age, ID, gender);
    }
    @Override
    public void update(msgObserverSystem subject) { System.out.println("Hello customer"); }
    @Override
    public void updateToPhone(msgObserverSystem subject) {

    }
    @Override
    public void updateToEmail(msgObserverSystem subject) {

    }
}




