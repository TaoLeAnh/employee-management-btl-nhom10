package employeeManagerSoftware;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.HashMap;

public class Report {

	private ArrayList<Employee> employeeList;
	
	public int totalEmployee() {
		int sum = 0;
		try (BufferedReader reader = new BufferedReader(new FileReader("file_path"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sum++;
            }
            return sum;
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void totalEmployeeByPosition() {
		HashMap<String, Integer> hashMap = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader("file_path"))) {
			
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 13) {
                	String positionCheck = parts[11];
                    if (hashMap.containsKey(positionCheck)) {
                    	int currentValue = hashMap.get(positionCheck);
                    	hashMap.put(positionCheck, currentValue+1);
                    }
                    else {
                    	hashMap.put(positionCheck, 1);
                    }
                }
            }
            
            System.out.printf("%-20s %-5s %n", "Chuc vu", "So luong");
            for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                System.out.printf("%-20s %-5d %n", key, value);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void salaryByPosition() {
		HashMap<String, Double> hashMap = new HashMap<>();
		try (BufferedReader reader = new BufferedReader(new FileReader("file_path"))) {
			
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                	String positionCheck = parts[1];
                	double positionSalary = Double.parseDouble(parts[2]);
                    if (!hashMap.containsKey(positionCheck)) {
                    	hashMap.put(positionCheck, positionSalary);
                    }
                }
            }
            
            System.out.printf("%-20s %-15s %n", "Chuc vu", "Muc luong");
            for (HashMap.Entry<String, Double> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                Double value = entry.getValue();
                System.out.printf("%-20s %-15.2f %n", key, value);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
	}
}