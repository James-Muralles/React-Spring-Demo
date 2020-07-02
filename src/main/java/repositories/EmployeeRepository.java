package repositories;
import model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
