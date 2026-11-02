package com.example.myApps;

import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/del/{empid}")
    public void delEmployee(@PathVariable int empid) {
        al.removeIf(emp -> emp.getEmployeeID() == empid);
    }

}
