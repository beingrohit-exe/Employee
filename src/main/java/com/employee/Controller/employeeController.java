package com.employee.Controller;

import com.employee.Payloads.apiResponse;
import com.employee.Payloads.employeeRequest;
import com.employee.Service.employeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
@Slf4j
public class employeeController {

    private final employeeService employeeService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public apiResponse registerEmployee(@RequestBody employeeRequest employeeRequest){
        log.warn("Employee Request");
        apiResponse apiResponse = this.employeeService.registerEmployee(employeeRequest);
        return apiResponse;
    }
}
