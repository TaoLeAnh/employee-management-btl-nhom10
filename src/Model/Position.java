/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author LAPTOP
 */
public class Position {
    private int positionID;
    private String positionName;
    private double positionSalary;

    public Position(int positionID) {
        this.positionID=positionID;
    }

    public Position(int positionID, String positionName, double positionSalary) {
        this.positionID = positionID;
        this.positionName = positionName;
        this.positionSalary = positionSalary;
    }

    public int getPositionID() {
        return positionID;
    }

    public void setPositionID(int positionID) {
        this.positionID = positionID;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public double getPositionSalary() {
        return positionSalary;
    }

    public void setPositionSalary(double positionSalary) {
        this.positionSalary = positionSalary;
    }

    @Override
    public String toString() {
        return "Position{" + "positionID=" + positionID + ", positionName=" + positionName + ", positionSalary=" + positionSalary + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Position other = (Position) obj;
        return Objects.equals(this.positionID, other.positionID);
    }

    
    
}
