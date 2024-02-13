package com.employees.managment.api.repositry;

import com.employees.managment.api.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositry extends CrudRepository<Employee, Long> {
}
