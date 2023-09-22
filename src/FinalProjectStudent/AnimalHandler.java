package FinalProjectStudent;

import FinalProject.Employee;
import FinalProject.ObserverSystem;

/**
 * The {@code AnimalHandler} class represents an animal handler who is an employee
 * responsible for taking care of animals in a zoo.
 */
public final class AnimalHandler {
    private String specialization;

    /**
     * Constructs a new {@code AnimalHandler} with the specified attributes.
     *
     * @param firstName       The first name of the animal handler.
     * @param lastName        The last name of the animal handler.
     * @param age             The age of the animal handler.
     * @param gender          The gender of the animal handler.
     * @param employeeID      The unique ID of the animal handler as an employee.
     * @param department      The department in which the animal handler works.
     * @param salary          The salary of the animal handler.
     * @param specialization  The specialization of the animal handler (e.g., "Mammals," "Birds").
     */


    /**
     * Gets the specialization of the animal handler.
     *
     * @return The specialization of the animal handler.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the specialization of the animal handler.
     *
     * @param specialization The specialization to set for the animal handler.
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * Performs animal handling duties specific to the animal handler's specialization.
     */
    public void handleAnimals() {
        // Implement animal handling logic based on specialization
    }

}
