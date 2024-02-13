package com.employees.managment.api.service;

import com.employees.managment.api.model.Employee;
import com.employees.managment.api.repositry.EmployeeRepositry;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepositry employeeRepositry;

    public Optional<Employee> getEmployee(final Long id) {
        return employeeRepositry.findById(id);
    }

    public Iterable<Employee> getEmployees() {
        return employeeRepositry.findAll();
    }

    public void deleteEmployee(final Long id) {
        employeeRepositry.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepositry.save(employee);
    }

}
