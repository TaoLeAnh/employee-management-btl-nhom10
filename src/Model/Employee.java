/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author LAPTOP
 */
public class Employee {
    private int employeeID;
    private String employeeName;
    private Date birthday;
    private String gender;
    private String homeTown;
    private String phoneNumber;
    private String email;
    private String adress;
    private Date hireDate;
    private double salary;
    private float workHour;
    private Position employeePosition;
    private Department employeeDepartmemt;
    
    public Employee(){
        
    }   

    public Employee(int employeeID, String employeeName, Date birthday, String gender, String homeTown, String phoneNumber, String email, String adress, Date hireDate, double salary, float workHour, Position employeePosition, Department employeeDepartmemt) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.birthday = birthday;
        this.gender = gender;
        this.homeTown = homeTown;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.adress = adress;
        this.hireDate = hireDate;
        this.salary = salary;
        this.workHour = workHour;
        this.employeePosition = employeePosition;
        this.employeeDepartmemt = employeeDepartmemt;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getWorkHour() {
        return workHour;
    }

    public void setWorkHour(float workHour) {
        this.workHour = workHour;
    }

    public Position getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(Position employeePosition) {
        this.employeePosition = employeePosition;
    }

    public Department getEmployeeDepartmemt() {
        return employeeDepartmemt;
    }

    public void setEmployeeDepartmemt(Department employeeDepartmemt) {
        this.employeeDepartmemt = employeeDepartmemt;
    }
    
    
}
