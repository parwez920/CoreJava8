package com;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    public static List<Employee> getEmployee() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "puja", 21323, "IT"));
        list.add(new Employee(102,"parwez",760009,"cs"));
        list.add(new Employee(103,"fassi",870000,"IT"));
        list.add(new Employee(104,"rehan",2100,"computer"));
        return list;
    }
}
