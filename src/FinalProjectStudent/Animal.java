package FinalProjectStudent;

import FinalProject.api.AnimalPrototype;
import FinalProject.api.IAnimal;

/**
 * The {@code Animal} class represents an individual animal in a zoo.
 * It contains information about the animal's species, age, and health status.
 * This class implements the Prototype pattern, allowing animals to reproduce
 * by creating new instances of themselves through cloning.
 */
public final class Animal {

    /**
     * The chip number of the animal.
     */
    private String chipNumber;

    /**
     * Whether the animal is carnivorous or not.
     */
    private boolean isCarnivorous;

    /**
     * Whether the animal is nocturnal or not.
     */
    private boolean isNocturnal;

    /**
     * The species of the animal.
     */
    private String species;

    /**
     * The type of the animal.
     */
    private String type;
    /**
     * The name of the animal.
     */
    private String name;
    /**
     * The habitat of the animal.
     */
    private String habitat;
    /**
     * The age of the animal in months.
     */
    private int ageMonths;

    /**
     * The health status of the animal.
     */
    private boolean isHealthy;

    /**
     * The sound of the animal.
     */
    private String sound;

    public String getType() {
        return type;
    }

    /**
     * Constructs a new {@code Animal} object with the specified species, age, and health status.
     *
     * @param species    The species of the animal.
     * @param ageMonths  The age of the animal in months.
     * @param isHealthy  The health status of the animal (true if healthy, false otherwise).
     * @param name       The name  of the animal.
     * @param habitat    The habitat  of the animal.
     * @param type       The type  of the animal.
     * @param chipNumber The type  of the animal.
     */
    public Animal(String species, int ageMonths, boolean isHealthy, String name, String habitat, String type, String chipNumber) {
        this.species = species;
        this.ageMonths = ageMonths;
        this.isHealthy = isHealthy;
        this.name = name;
        this.habitat = habitat;
        this.type = type;
        this.chipNumber = chipNumber;

    }

    /**
     * Creates a new {@code Animal} object by copying the attributes from another {@code Animal}.
     *
     * @param other The {@code Animal} object to copy attributes from.
     */
    public Animal(Animal other) {
        this.species = other.species;
        this.ageMonths = other.ageMonths;
        this.isHealthy = other.isHealthy;
        this.name = other.name;
        this.habitat = other.habitat;
        this.type = other.type;
        this.isCarnivorous = other.isCarnivorous;
        this.isNocturnal = other.isNocturnal;
        this.chipNumber = other.chipNumber;
    }

    //-----------------------------------------------------------------------
    /**
     * Creates a new {@code Animal} object by copying the attributes from another {@code Animal}.
     *
     * @param other The {@code Animal} object to copy attributes from.
     */
    //-----------------------------------------------------------------------

    /**
     * Returns the species of the animal.
     *
     * @return The species of the animal.
     */
    public String getSpecies() {
        return species;
    }

    /**
     * Returns the age of the animal in months.
     *
     * @return The age of the animal in months.
     */
    public int getAgeMonths() {
        return ageMonths;
    }

    /**
     * Returns the health status of the animal.
     *
     * @return {@code true} if the animal is healthy, {@code false} otherwise.
     */
    public boolean isHealthy() {
        return isHealthy;
    }

    /**
     * Sets the health status of the animal.
     *
     * @param healthy {@code true} if the animal is healthy, {@code false} otherwise.
     */
    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    /**
     * Returns a string representation of the animal.
     *
     * @return A string describing the animal.
     */
    @Override
    public String toString() {
        return "Animal{" +
                "chipNumber='" + chipNumber + '\'' +
                ", isCarnivorous=" + isCarnivorous +
                ", isNocturnal=" + isNocturnal +
                ", species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", habitat='" + habitat + '\'' +
                ", ageMonths=" + ageMonths +
                ", isHealthy=" + isHealthy +
                ", sound='" + sound + '\'' +
                '}';
    }

    //-----------------------------------------------------------------------
    /**
     * The {@code AnimalBuilder} class is used to construct instances of the {@code Animal} class
     * with various optional parameters, allowing for a flexible and convenient way to create animal objects.
     */
    //-----------------------------------------------------------------------


}
