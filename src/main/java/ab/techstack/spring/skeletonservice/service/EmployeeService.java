package ab.techstack.spring.skeletonservice.service;

import ab.techstack.spring.skeletonservice.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Iterable<Employee> getAllEmpIterable();
}
