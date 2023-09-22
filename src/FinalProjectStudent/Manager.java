package FinalProjectStudent;

import FinalProject.Employee;
import FinalProject.ObserverSystem;

/**
 * The {@code Manager} class represents a manager who is an employee responsible for overseeing
 * operations in a department or section of a zoo.
 */
public class Manager {
    private String departmentManaged;

    /**
     * Constructs a new {@code Manager} with the specified attributes.
     *
     * @param firstName         The first name of the manager.
     * @param lastName          The last name of the manager.
     * @param age               The age of the manager.
     * @param gender            The gender of the manager.
     * @param employeeID        The unique ID of the manager as an employee.
     * @param department        The department in which the manager works.
     * @param salary            The salary of the manager.
     * @param departmentManaged The department or section managed by the manager.
     */


    /**
     * Gets the department or section managed by the manager.
     *
     * @return The department or section managed by the manager.
     */
    public String getDepartmentManaged() {
        return departmentManaged;
    }

    /**
     * Sets the department or section managed by the manager.
     *
     * @param departmentManaged The department or section to be managed by the manager.
     */
    public void setDepartmentManaged(String departmentManaged) {
        this.departmentManaged = departmentManaged;
    }

    /**
     * Manages department-specific operations and tasks as per the manager's responsibilities.
     */
    public void manageDepartment() {
        // Implement department management logic here
    }


}
