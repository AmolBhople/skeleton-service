package ab.techstack.spring.skeletonservice.controller;

import ab.techstack.spring.skeletonservice.entity.Employee;
import ab.techstack.spring.skeletonservice.service.EmployeeService;
import io.micrometer.core.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    @ResponseBody
    @Timed(value = "allEmployeeAPI")
    public List<Employee> getAllEmployees(){
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/itr")
    @ResponseBody
    public Iterable<Employee> getAllEmpIterable(){
        return this.employeeService.getAllEmpIterable();
    }
}
