package com.dgmf.controller;

import com.dgmf.controller.response.StudentResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Value("${app.name:Default Demo App}")
    private String appName;

    @GetMapping
    // public String getStudents() {
    public StudentResponse getStudents() {
        // return "Student List";
        // return appName;
        return new StudentResponse(1, "John", "Doe");
    }
}
