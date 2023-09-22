package FinalProjectStudent;

import FinalProject.ObserverSystem;
import FinalProject.Person;

/**
 * The {@code Employee} class represents an employee with various attributes,
 * including their first name, last name, age, gender, employee ID, department,
 * and salary.
 * It extends the {@link FinalProject.Person} class to inherit basic personal information.
 */
public class Employee  {
    private String employeeID;
    private String department;
    private double salary;

    /**
     * Constructs a new {@code Employee} with the specified attributes.
     *
     * @param firstName  The first name of the employee.
     * @param lastName   The last name of the employee.
     * @param age        The age of the employee.
     * @param gender     The gender of the employee.
     * @param employeeID The employee ID of the employee.
     * @param department The department in which the employee works.
     * @param salary     The salary of the employee.
     */


    /**
     * Gets the employee ID of the employee.
     *
     * @return The employee ID.
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the employee ID of the employee.
     *
     * @param employeeID The employee ID to set.
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Gets the department in which the employee works.
     *
     * @return The department.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department in which the employee works.
     *
     * @param department The department to set.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets the salary of the employee.
     *
     * @return The salary.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the salary of the employee.
     *
     * @param salary The salary to set.
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Represents the performance of duties by the employee.
     * Implement specific duties logic in subclasses as needed.
     */
    public void performDuties() {
        // Implement employee's duties logic here
    }


}
