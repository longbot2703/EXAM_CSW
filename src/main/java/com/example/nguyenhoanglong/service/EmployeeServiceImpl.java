package com.example.nguyenhoanglong.service;

import com.example.nguyenhoanglong.entity.Employee;
import com.example.nguyenhoanglong.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee findEmployeeByName(String name) {
        return findEmployeeByName(name);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee employeeUpdate = findEmployeeById(employee.getId());
        employeeUpdate.setName(employee.getName());
        employeeUpdate.setSalary(employee.getSalary());
        return employeeRepo.save(employeeUpdate);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public Employee findEmployeeById(int id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public List<Employee> getEmployeeByNameCustom(String name) {
        return employeeRepo.findEmployeeByNameCustom(name);
    }
}
