package com.example.myApps;

public class employeeModel {
    private String employeeName;
    private int employeeID;
    private long employeeSalary;

    employeeModel(String employeeName, int employeeID, long employeeSalary) {
        this.employeeID = employeeID;
        this.employeeSalary = employeeSalary;
        this.employeeName = employeeName;
    }

    //getter
    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public long getEmployeeSalary() {
        return this.employeeSalary;
    }
    //setter


    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeSalary(long employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
