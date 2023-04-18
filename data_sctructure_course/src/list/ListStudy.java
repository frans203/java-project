package list;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {
    public static void main(String[] args) {
        List<Employee> employeeList =  new ArrayList<>();
         employeeList.add(new Employee("Jane", "Jones", 123));
         employeeList.add(new Employee("John", "Doe", 4567));
         employeeList.add(new Employee("Mary", "Smith", 22));
         employeeList.add(new Employee("Mike", "Wilson", 3245));
        //print all employees
        //         employeeList.forEach(System.out::println);
        //print single employee
        //        System.out.println(employeeList.get(1));
        //verify if list is empty
        //        System.out.println(employeeList.isEmpty());
        //set one element in the same place of another
        employeeList.set(1, new Employee("John", "Adams", 4568));
        //get length of the array
//        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Martin", 4567));
//        employeeList.forEach(System.out::println);
        //converting the employeeList to an array with the same size
        Employee[] employeeArray =
                employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee : employeeArray){
//            System.out.println(employee);
        }

//        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        //the method contains check if the objects are the same
        // instances. In the case above it returns false by default
        // . But if we override the equals and hash methods inside
        // our class, we will be able to see that we will compare
        // the object passed inside contains by its properties, not
        // if it's the same instance or not.
//        System.out.println(employeeList.contains(new Employee(
//                "John", "Martin", 4567)));

        employeeList.remove(0); //remove elements by index
        employeeList.remove(new Employee("Mary", "Smith", 22));
        //remove elements by comparing objects
        employeeList.forEach(System.out::println);
    }
}
