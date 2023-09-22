package FinalProjectStudent;


import FinalProject.api.IObserver;
import FinalProject.api.IObserverSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code ObserverSystem} class represents a Singleton implementation of the Observer pattern.
 * It allows attaching, detaching, and notifying observers.
 */
public final class ObserverSystem  {

    // Singleton instance
    private static ObserverSystem instance;

    // List of observers
    private List<IObserver> observers;

    /**
     * Private constructor to prevent direct instantiation.
     */
    private ObserverSystem() {
        observers = new ArrayList<>();
    }

    /**
     * Get the singleton instance of the ObserverSystem.
     *
     * @return The singleton instance.
     */
    public static ObserverSystem getInstance() {
        if (instance == null) {
            instance = new ObserverSystem();
        }
        return instance;
    }


}
