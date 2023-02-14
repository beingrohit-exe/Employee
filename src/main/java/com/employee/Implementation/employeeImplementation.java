package com.employee.Implementation;

import com.employee.Entity.Employee;
import com.employee.Exceptions.ApiException;
import com.employee.Payloads.apiResponse;
import com.employee.Payloads.employeeRequest;
import com.employee.Repository.employeeRepository;
import com.employee.Service.employeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class employeeImplementation implements employeeService {

    private final employeeRepository employeeRepository;

    @Override
    public apiResponse registerEmployee(employeeRequest employeeRequest) {
        if (Boolean.TRUE.equals(employeeRepository.existsByEmailIgnoreCase(employeeRequest.getEmail()))){
            throw new ApiException("Email already exists in database");
        }
        if (Boolean.TRUE.equals(employeeRepository.existsByEmployeeId(employeeRequest.getEmployeeId()))){
            throw new ApiException("Employee Id already exists in database");
        }
        Employee newEmployee = Employee
                .builder()
                .employeeId(employeeRequest.getEmployeeId())
                .name(employeeRequest.getName())
                .email(employeeRequest.getEmail())
                .phoneNo(employeeRequest.getPhoneNo())
                .designation(employeeRequest.getDesignation())
                .build();
        Employee savedEmployee = employeeRepository.save(newEmployee);
        return new apiResponse("Registered Successfully", true);
    }
}
