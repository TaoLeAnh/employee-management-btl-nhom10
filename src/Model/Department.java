/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author LAPTOP
 */
public class Department {
    private int departmentID;
    private String departmentName;
    private String departmentAdress;
    private String departmentPhoneNumber;
    
   public Department(){
       
   }

    public Department(int departmentID, String departmentName, String departmentAdress, String departmentPhoneNumber) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.departmentAdress = departmentAdress;
        this.departmentPhoneNumber = departmentPhoneNumber;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAdress() {
        return departmentAdress;
    }

    public void setDepartmentAdress(String departmentAdress) {
        this.departmentAdress = departmentAdress;
    }

    public String getDepartmentPhoneNumber() {
        return departmentPhoneNumber;
    }

    public void setDepartmentPhoneNumber(String departmentPhoneNumber) {
        this.departmentPhoneNumber = departmentPhoneNumber;
    }

    @Override
    public String toString() {
        return "Department{" + "departmentID=" + departmentID + ", departmentName=" + departmentName + ", departmentAdress=" + departmentAdress + ", departmentPhoneNumber=" + departmentPhoneNumber + '}';
    }
   
   
}
