package conceptinterface;

public class Department implements BasicInformation {
	private String departmentName;
    private String departmentBuilding;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentBuilding() {
		return departmentBuilding;
	}
	public void setDepartmentBuilding(String departmentBuilding) {
		this.departmentBuilding = departmentBuilding;
	}
	@Override
	public String BasicInfo() {
		// TODO Auto-generated method stub
		 return  "Department Name: "+ departmentName +" Department Building: "+departmentBuilding;
	}
    
}
