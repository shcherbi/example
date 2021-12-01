package core.stream;

import core.stream.beans.Department;
import core.stream.beans.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = hireEmployees();

        employees.stream()
                .filter(employee -> employee.getLevel() > 2)
                .map(Employee::getDepartment)
                .distinct()
                .sorted(Comparator.comparing(Department::getName))
                .forEach(System.out::println);


    }

    private static List<Employee> hireEmployees() {
        Department financialDepartament = new Department("Finance Department");
        Department backendDepartament = new Department("Backend department");
        return Arrays.asList(new Employee(19, "Vasja", "Java", 1, financialDepartament),
                new Employee(20, "Petya", ".NET", 3, financialDepartament),
                new Employee(3, "Johann", "Delphi", 5, backendDepartament));
    }
}
