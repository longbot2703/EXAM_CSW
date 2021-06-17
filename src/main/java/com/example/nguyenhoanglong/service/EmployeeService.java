package com.example.nguyenhoanglong.service;

import com.example.nguyenhoanglong.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployee();
    Employee createEmployee(Employee employee);
    Employee findEmployeeByName(String name);
    Employee updateEmployee(Employee employee);
    Employee getEmployeeById(int id);
    Employee findEmployeeById(int id);
    List<Employee> getEmployeeByNameCustom(String name);
}
