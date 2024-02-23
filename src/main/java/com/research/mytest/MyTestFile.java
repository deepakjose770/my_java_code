package com.research.mytest;

import java.util.ArrayList;
import java.util.List;

public class MyTestFile {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee();
        employeeList.add(employee);

        System.out.println(employeeList);
        employee.setName("Deepak");
        employee.setAge("26");
        employee.setAddress("myHouse");

        System.out.println(employeeList);

    }
}
