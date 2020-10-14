import java.util.ArrayList;
import java.util.List;

public class Company {

    String name;
    List<Employee> employees;

    Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    void add(Employee employee) {
        this.employees.add(employee);
    }

    void allEmployeeIdsInOrder() throws AppException {
        for (Employee employee : this.employees) {
            employee.notifyId();
        }
    }

    void allEmployeeHashCodesInOrder() {
        for (Employee employee : this.employees) {
            employee.notifyHashCode();
        }
    }
}
