package lamdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaExample {

    public static void main(String[] args) {
       
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 25, 60000));
        employees.add(new Employee("Charlie", 35, 55000));

        Collections.sort(employees, new AgeComparator());

        System.out.println("Employees sorted by age: " + employees);

        Collections.sort(employees, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        System.out.println("Employees sorted by name: " + employees);
        
        Collections.sort(employees,(e1,e2) -> e2.getSalary() - e1.getSalary());
        
        System.out.println("Employees sorted by salary: " + employees);

     
    }
}
