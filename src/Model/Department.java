package employeeManagerSoftware;

public class Department {
	
	private int departmentID;
	private String departmentName;
	private String departmentAddress;
	private String departmentPhoneNumber;
	
	public Department() {
		this.departmentID = 0;
		this.departmentName = "";
		this.departmentAddress = "";
		this.departmentPhoneNumber = "";
	}
	
	public Department(int departmentID, String departmentName, String departmentAddress, String departmentPhoneNumber) {
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
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
	
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	
	public String getDepartmentPhoneNumber() {
		return departmentPhoneNumber;
	}
	public void setDepartmentPhoneNumber(String departmentPhoneNumber) {
		this.departmentPhoneNumber = departmentPhoneNumber;
	}

	@Override
	public String toString() {
		return "departmentID=" + departmentID + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departmentPhoneNumber=" + departmentPhoneNumber;
	}
	
}