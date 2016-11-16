package quickstart;

import java.io.*;

/**
 * Created by billy on 11/13/16.
 */
public class EmployeeTest {
    public static void main(String[] args){

        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmplyee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmplyee();
    }
}
