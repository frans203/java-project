package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorStudy {
    public static void main(String[] args) {
        List<Employee> employeeList =  new Vector<>(); //vector
        // also implements list
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
    }
}
