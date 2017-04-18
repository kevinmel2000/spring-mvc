package com.mitrais.trainee;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
    value = HttpStatus.NOT_FOUND,
    reason = ""
)
public class EmployeeNotFoundException extends RuntimeException{

}