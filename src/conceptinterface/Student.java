package conceptinterface;

public class Student implements BasicInformation {
	private String studentName;
    private String studentId;
    
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	@Override
	public String BasicInfo() {
		// TODO Auto-generated method stub
		return "Student Name: "+studentName+" Student Id: "+studentId;
	}
    
}
