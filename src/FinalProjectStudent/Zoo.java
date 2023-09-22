package FinalProjectStudent;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The {@code Zoo} class represents a zoo with various properties, including its name,
 * manager, enclosures, and employees. It can be constructed using the {@link ZooBuilder}
 * to facilitate flexible object creation.
 */
final public class Zoo {

    /**
     * The name of the zoo.
     */
    private String zooName;

    /**
     * The manager of the zoo.
     */
    private Manager manager;

    /**
     * A map of enclosures in the zoo, where the key is the enclosure's name and the value is the enclosure object.
     */
    private Map<String, Enclosure> enclosureMap;

    /**
     * A map of employees in the zoo, where the key is the employee's ID and the value is the employee object.
     */
    private Map<String, Employee> employeeMap;


    /**
     * A List of visitors in the zoo.
     */
    private List<Visitor> visitors;

    /**
     * Constructs a new {@code Zoo} with the specified name and manager.
     *
     * @param name    The name of the zoo.
     * @param manager The manager of the zoo.
     */
    public Zoo(String name, Manager manager) {
        this.zooName = name;
        this.manager = manager;
        this.employeeMap = new HashMap<>();
        this.enclosureMap = new HashMap<>();
    }

    //-----------------------------------------------------------------------
    /**
     * Constructs a new {@code Zoo} using a {@link ZooBuilder} to facilitate flexible
     * object creation.
     *
     * @param zooBuilder The {@code ZooBuilder} containing zoo configuration.
     */
    //-----------------------------------------------------------------------


    //-----------------------------------------------------------------------
    /**
     * The {@code ZooBuilder} class provides a builder pattern for constructing zoos.
     * It allows you to set various properties of the zoo, such as its name, manager,
     * enclosures, and employees, before building the final zoo object.
     */
    //-----------------------------------------------------------------------

}
