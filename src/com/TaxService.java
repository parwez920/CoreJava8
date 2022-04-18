package com;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUser(String tax){
       return (tax.equalsIgnoreCase("tax"))?
            EmployeeDAO.getEmployee().stream().filter(employee -> employee.getSalary()>50000).collect(Collectors.toList())
                :EmployeeDAO.getEmployee().stream().filter(employee -> employee.getSalary()<50000).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(evaluateTaxUser("tax"));
    }
}
