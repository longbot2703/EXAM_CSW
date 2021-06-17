package com.example.nguyenhoanglong.datasource;

import com.example.nguyenhoanglong.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    private static List<Employee> listEmployee;

    public static List<Employee> getListEmployee() {
        if (listEmployee == null) {
            List<Employee> list = new ArrayList<>();
            for (int i = 0; i < 10; i++){
                int salary = 1000 * i;
                Employee model = new Employee (+i, "employee"+i, salary);
                list.add(model);
            }
            listEmployee = list;
        }
        return listEmployee;
    }
}
