package com.springdemo.department_service.client;

import com.springdemo.department_service.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {
    @GetExchange("/employee/department/{departmentId}")
    public List<Employee> findByDepartmentId(@PathVariable Long departmentId);
}
