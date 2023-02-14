package com.employee.Payloads;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class employeeRequest {
    private String EmployeeId;
    private String name;
    private String phoneNo;
    private String email;
    private String designation;
}
