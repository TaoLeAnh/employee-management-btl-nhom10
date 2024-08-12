package employeeManagerSoftware;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentManagement {
	
	private ArrayList<Department> departmentList;

	public DepartmentManagement() {
		this.departmentList = new ArrayList<>();
	}
	
	public void loadFromFile() {
		
        departmentList.clear();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("file_path"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                	
                	int departmentID = Integer.parseInt(parts[0]);
                    String departmentName = parts[1];
                    String departmentAddress = parts[2];
                    String departmentPhoneNumber = parts[3];
                    
                    Department x = new Department(departmentID, departmentName, departmentAddress, departmentPhoneNumber);
                    departmentList.add(x);
                }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file_path"))) {
            for (Department x : departmentList) {
                writer.write(x.toString());
                writer.newLine();
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public boolean addNewDepartment(Department x) {
		for (Department y : departmentList) {
			if (y.getDepartmentID() == x.getDepartmentID()) {
				System.out.println("Phong ban da ton tai. Them moi that bai");
				return false;
			}
		}
		departmentList.add(x);
		return true;
	}
	
	public void removeDepartment(Department x) {
		departmentList.remove(x);
	}
	
	public boolean editDepartment(Department x) {
		Scanner sc = new Scanner(System.in);
		for (Department y : departmentList) {
			if (y.getDepartmentID() == x.getDepartmentID()) {
				
				System.out.println("Nhap id moi: ");
				int departmentID = sc.nextInt();
				y.setDepartmentID(departmentID);
				
				System.out.println("Nhap ten moi: ");
				String departmentName = sc.nextLine();
				y.setDepartmentName(departmentName);
				
				System.out.println("Nhap dia chi moi: ");
				String departmentAddress = sc.nextLine();
				y.setDepartmentAddress(departmentAddress);
				
				System.out.println("Nhap so dien thoai moi: ");
				String departmentPhoneNumber = sc.nextLine();
				y.setDepartmentPhoneNumber(departmentPhoneNumber);
				
				sc.close();
				return true;
			}
		}
		sc.close();
		return false;
	}
}