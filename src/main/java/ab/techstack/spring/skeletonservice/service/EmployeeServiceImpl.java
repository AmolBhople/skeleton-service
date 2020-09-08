package ab.techstack.spring.skeletonservice.service;

import ab.techstack.spring.skeletonservice.entity.Employee;
import ab.techstack.spring.skeletonservice.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        this.employeeRepository.findAll().forEach(employees :: add);
        return employees;
    }

    @Override
    public Iterable<Employee> getAllEmpIterable(){
        Iterable<Employee> employees = this.employeeRepository.findAll();
        return employees;
    }
}
