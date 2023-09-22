package FinalProjectStudent;

import FinalProject.ObserverSystem;
import FinalProject.Person;

/**
 * The {@code Visitor} class represents a visitor at a zoo.
 * It stores information about the visitor, including their name, age, and ticket type.
 */
public final class Visitor {

    private String ticketType;


    /**
     * Constructs a new {@code Visitor} with the specified name, age, and ticket type.
     *
     * @param firstName  The first name of the person.
     * @param lastName   The last name of the person.
     * @param age        The age of the person.
     * @param gender     The gender of the person.
     * @param ticketType The type of ticket held by the visitor (e.g., "Adult," "Child").
     */


    /**
     * Gets the type of ticket held by the visitor.
     *
     * @return The ticket type of the visitor (e.g., "Adult," "Child").
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * Returns a string representation of the {@code Visitor} object.
     *
     * @return A string representation including the name, age, and ticket type of the visitor.
     */
    @Override
    public String toString() {
        return "Visitor{" +
                "ticketType='" + ticketType + '\'' +
                '}';
    }


}
