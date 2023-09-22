package FinalProjectStudent;


import FinalProject.Animal;
import FinalProject.api.IEnclosure;

import java.util.LinkedList;
import java.util.List;

/**
 * The {@code Enclosure} class represents an enclosure in a zoo that houses animals.
 */
public final class Enclosure {
    private String name;
    private String type;
    private List<FinalProject.Animal> animals;

    /**
     * Constructs a new {@code Enclosure} object with the specified name and type.
     *
     * @param name The name of the enclosure.
     * @param type The type of animals the enclosure is designed for (e.g., "Mammals," "Birds").
     */
    public Enclosure(String name, String type) {
        this.name = name;
        this.type = type;
        this.animals = new LinkedList<>();
    }

    /**
     * Gets the name of the enclosure.
     *
     * @return The name of the enclosure.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the enclosure.
     *
     * @param name The name to set for the enclosure.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the type of animals the enclosure is designed for.
     *
     * @return The type of animals the enclosure is designed for.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of animals the enclosure is designed for.
     *
     * @param type The type of animals to set for the enclosure.
     */
    public void setType(String type) {
        this.type = type;
    }



    /**
     * Gets a list of animals currently housed in the enclosure.
     *
     * @return A list of animals in the enclosure.
     */
    public List<Animal> getAnimals() {
        return animals;
    }

    /**
     * Returns a string representation of the {@code Enclosure} object.
     *
     * @return A string describing the enclosure, including its name and type.
     */
    @Override
    public String toString() {
        return "Enclosure{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
