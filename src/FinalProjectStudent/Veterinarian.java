package FinalProjectStudent;

import FinalProject.Employee;
import FinalProject.ObserverSystem;

/**
 * The {@code Veterinarian} class represents a veterinarian who is an employee responsible for
 * providing medical care and treatment to animals in a zoo.
 */
public final class Veterinarian  {
    private String specialization;

    /**
     * Constructs a new {@code Veterinarian} with the specified attributes.
     *
     * @param firstName       The first name of the veterinarian.
     * @param lastName        The last name of the veterinarian.
     * @param age             The age of the veterinarian.
     * @param gender          The gender of the veterinarian.
     * @param employeeID      The unique ID of the veterinarian as an employee.
     * @param department      The department in which the veterinarian works.
     * @param salary          The salary of the veterinarian.
     * @param specialization  The medical specialization of the veterinarian (e.g., "Wildlife Medicine," "Exotic Animals").
     */


    /**
     * Gets the medical specialization of the veterinarian.
     *
     * @return The medical specialization of the veterinarian.
     */
    public String getSpecialization() {
        return specialization;
    }

    /**
     * Sets the medical specialization of the veterinarian.
     *
     * @param specialization The medical specialization to set for the veterinarian.
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * Provides medical care and treatment to animals based on the veterinarian's specialization.
     */
    public void provideMedicalCare() {
        // Implement medical care logic based on specialization
    }


}
