package FinalProjectStudent;

import FinalProject.Animal;

/**
 * The {@code AnimalFacade} class provides a simplified interface for creating and interacting with animal objects.
 */
public final class AnimalFacade {

    /**
     * Creates a new animal with the specified attributes using the {@code AnimalBuilder}.
     *
     * @param species    The species of the animal.
     * @param ageMonths  The age of the animal in months.
     * @param isHealthy  The health status of the animal (true if healthy, false otherwise).
     * @param name       The name of the animal.
     * @param habitat    The habitat of the animal.
     * @param type       The type of the animal.
     * @param chipNumber The chip number of the animal.
     * @return A new animal object.
     */
    public static FinalProject.Animal createAnimal(String species, int ageMonths, boolean isHealthy, String name, String habitat, String type, String chipNumber) {
        FinalProject.Animal.AnimalBuilder builder = new FinalProject.Animal.AnimalBuilder(species, type, name, habitat, ageMonths, isHealthy);
        builder.setChipNumber(chipNumber);
        return builder.build();
    }

    /**
     * Clones an existing animal to create a new one with identical attributes.
     *
     * @param animal The animal to clone.
     * @return A new animal object that is a clone of the original animal.
     */
    public static FinalProject.Animal cloneAnimal(FinalProject.Animal animal) {
        return new FinalProject.Animal(animal);
    }

    /**
     * Displays information about the specified animal.
     *
     * @param animal The animal to display information about.
     */
    public static void displayAnimalInfo(Animal animal) {
        animal.displayInfo();
    }

}
