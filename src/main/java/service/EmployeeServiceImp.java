package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import repositories.EmployeeRepository;

import java.util.List;


public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;
    @Transactional
    @Override
    public List<Employee> get() {
        return employeeRepo.get();
    }
    @Transactional
    @Override
    public Employee get(int id) {
        return employeeRepo.get(id);
    }
    @Transactional
    @Override
    public void save(Employee employee) {
        employeeRepo.save(employee);

    }
    @Transactional
    @Override
    public void delete(int id) {
        employeeRepo.delete(id);

    }
}
