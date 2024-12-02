package com.dgmf.controller;

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
    public String getStudents() {
        // return "Student List";
        return appName;
    }
}
