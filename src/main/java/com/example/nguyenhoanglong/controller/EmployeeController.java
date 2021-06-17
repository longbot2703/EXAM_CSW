package com.example.nguyenhoanglong.controller;

import com.example.nguyenhoanglong.model.BaseResponse;
import com.example.nguyenhoanglong.entity.Employee;
import com.example.nguyenhoanglong.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public BaseResponse getEmployee(@RequestParam Map<String, String> params) {
        BaseResponse res = new BaseResponse();
        String name = params.get("name");
        String id = params.get("id");
        if (name != null) {
            res.data = employeeService.getEmployeeByNameCustom(name);
        } else if (id != null) {
            res.data = employeeService.getEmployeeById(Integer.parseInt(id));
        } else {
            res.data = employeeService.getAllEmployee();
        }
        return res;
    }

    @PostMapping
    public BaseResponse createEmployee(@RequestBody Employee employee) {
        BaseResponse res = new BaseResponse();
        res.data = employeeService.createEmployee(employee);
        return res;
    }

    @PutMapping
    public BaseResponse updateEmployee(@RequestBody Employee employee) {
        BaseResponse res = new BaseResponse();
        res.data = employeeService.updateEmployee(employee);
        return res;
    }
}
