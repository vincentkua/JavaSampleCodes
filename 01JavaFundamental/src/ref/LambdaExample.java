package ref;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class LambdaExample {
    
    public static void main(String[] args) {
        LambdaInterface<Integer> addOperation = (a, b) -> {
            return a + b;
        };
        System.out.println(addOperation.process(1,3));

        // list of employee
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "Adam", "Cheng", 50000));
        employees.add(new Employee(2, "Kelvin", "Tan", 2000));
        employees.add(new Employee(3, "Melvin", "Lee", 4000));
        employees.add(new Employee(4, "Alvin", "Yew", 6000));
        employees.add(new Employee(5, "Adam", "Zhang", 3000));

        // SHOW ALL==============================================================
        employees.forEach(emp -> {
        System.out.println(emp);
        });

        // FILTER CH==============================================================
        // List<Employee> filteredEmployee = employees.stream().filter(emp ->
        // emp.getLastname().contains("Ch"))
        // .collect(Collectors.toList());
        // filteredEmployee.forEach(emp -> System.out.println(emp));

        // SORT BY NAME(method 1)====================================================
        // employees.sort(Comparator.comparing(e -> e.getFirstName()));
        // employees.forEach(emp -> {
        // System.out.println(emp);
        // });

        // SORT BY NAME(method
        // 2)========================================================
        // employees.sort(Comparator.comparing(Employee::getFirstName));
        // employees.forEach(emp -> {
        // System.out.println(emp);
        // });

        // SORT BY NAME Descending Order================================================
        // employees.sort(Comparator.comparing(Employee::getFirstName).reversed());
        // employees.forEach(emp -> {
        // System.out.println(emp);
        // });

        // USING COMPARATOR
        // Comparator<Employee> compare = Comparator.comparing(e -> e.getFirstName());
        // employees.sort(compare.reversed());
        // employees.forEach(emp -> {
        //     System.out.println(emp);
        // });

        // Comparator<Employee> groupByComparator = Comparator.comparing(Employee::getFirstName)
        //         .thenComparing(Employee::getLastName);
        // employees.sort(groupByComparator);
        // employees.forEach(emp -> {
        //     System.out.println(emp);
        // });






        
    }    
    
}
