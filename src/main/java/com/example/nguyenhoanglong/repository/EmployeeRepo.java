package com.example.nguyenhoanglong.repository;

import com.example.nguyenhoanglong.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    Employee findByName(String name);

    @Query("select emp from Employee emp where emp.name like %:name%")
    List<Employee> findEmployeeByNameCustom(String name);

}
