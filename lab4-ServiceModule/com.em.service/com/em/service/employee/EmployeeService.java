package com.em.service.employee;

import com.em.common.model.Employee;
 
public class EmployeeService {
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Venkata");
        employee.setLastName("Ramana");
        employee.setDesignation("Developer");
        
        return employee;
    }
}