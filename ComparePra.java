import java.util.*;


class Employee implements Comparable<Employee> {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}


class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        int nameComparison = e1.name.compareTo(e2.name);
        return (nameComparison != 0) ? nameComparison : Integer.compare(e1.age, e2.age);
    }
}

public class ComparePra
{

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("Bob", 25));
        employees.add(new Employee("Charlie", 35));
        employees.add(new Employee("Alice", 28));

       
        Collections.sort(employees);
        System.out.println("Sorted by Age (Comparable): " + employees);

        
        Collections.sort(employees, new EmployeeComparator());
        System.out.println("Sorted by Name, then Age (Comparator): " + employees);
    }
}
