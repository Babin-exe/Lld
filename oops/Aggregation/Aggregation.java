
import java.util.*;

public class Aggregation {

    public static class Employee {

        private String name;
        private String role;

        public Employee(String name, String role) {
            this.name = name;
            this.role = role;
        }

        public String getName() {
            return this.name;
        }

        public String getRole() {
            return this.role;
        }
    }

    public static class Department {

        private String name;

        public Department(String name) {
            this.name = name;
        }
        private List<Employee> employees;

        public Department(String name, List<Employee> employees) {
            this.name = name;
            this.employees = employees;
        }

        void printEmployees() {
            System.out.println("─ " + name + " ─");
            this.employees.forEach((e) -> System.out.println("->" + e.getName() + "(" + e.getRole() + ")"));
        }

        int headCount() {
            return this.employees.size();
        }

    }

    public static void main(String[] agrs) {
        Employee e1 = new Employee("auh", "Ceo");
        Employee e2 = new Employee("Mark", "Manager");
        Employee e3 = new Employee("Eve", "Sales head");

        Department d1 = new Department("Engineering", Arrays.asList(e1, e2, e3));

        System.out.println("The total employees in this department are : " + d1.headCount());
        d1.printEmployees();

    }
}


/* 
The whole contains parts, but parts can exist without the whole
Aggregation is a specialised association where one class acts as the container ("whole") and the other as the contained ("part").
If the whole is destroyed, the parts survive. Modelled as a hollow diamond in UML.
*/
