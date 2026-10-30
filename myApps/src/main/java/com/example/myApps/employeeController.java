package com.example.myApps;

import java.util.ArrayList;

public class employeeController {


    ArrayList<employeeModel> al = new ArrayList<>();

    public employeeModel setmodel() {
        employeeModel emp = new employeeModel("shubbhu", 500, 800000);
        al.add(emp);
        return emp;
    }


}
