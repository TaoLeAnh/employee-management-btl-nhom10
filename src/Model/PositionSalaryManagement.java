package employeeManagerSoftware;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PositionSalaryManagement {
	
	private ArrayList<Position> positionList;

	public PositionSalaryManagement() {
		positionList = new ArrayList<>();
	}
	
	public void loadFromFile() {
		
        positionList.clear();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("file_path"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                	
                	int positionID = Integer.parseInt(parts[0]);
                    String positionName = parts[1];
                    double positionSalary = Double.parseDouble(parts[2]);
                    
                    Position x = new Position(positionID, positionName, positionSalary);
                    positionList.add(x);
                }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
	 
	public void saveToFile() {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file_path"))) {
	            for (Position x : positionList) {
	                writer.write(x.toString());
	                writer.newLine();
	            }
	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	 }
	 
    public void displayPositions() {
        System.out.printf("%-5s %-20s %-15s %n", "ID", "Name", "Salary");
        for (Position x : positionList) {
        	System.out.printf("%-5d %-20s %-15.2f %n", x.getPositionID(), x.getPositionName(), x.getPositionSalary());
        }
    }
    
    public void positionSalaryEdit(String ID) {
        for (Position x : positionList) {
            if (x.getID() == ID) {
                System.out.println("Nhap muc luong moi: ");
                String positionSalary = System.console().readLine();
                x.setPositionSalary(Double.parseDouble(positionSalary));
                
                System.out.println("Muc luong cua chuc vu co ID" + x.getPositionID() + " da duoc cap nhat");
                break;
            }
        }
        System.out.println("Khong tim thay chuc vu co ID la " + ID);
    }
}