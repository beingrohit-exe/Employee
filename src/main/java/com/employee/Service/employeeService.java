package com.employee.Service;

import com.employee.Payloads.apiResponse;
import com.employee.Payloads.employeeRequest;

public interface employeeService {
    apiResponse registerEmployee(employeeRequest employeeRequest);
}
