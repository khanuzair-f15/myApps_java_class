package com.example.myApps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class employeeController {

    ArrayList<employeeModel> al = new ArrayList<>();

    @GetMapping("/get")
    public ArrayList<employeeModel> getEmployee() {
        return new ArrayList<>(al);
    }

    @PostMapping("/post")
    public void postEmployee(@RequestBody employeeModel emp) {
        al.add(new employeeModel(emp.getEmployeeName(), emp.getEmployeeID(), emp.getEmployeeSalary()));
    }
}
