package conceptinterface;

import java.util.ArrayList;

public class StartUp {

	public static void main(String[] args) {
		
		
		Course cr = new Course();
        cr.setCourseName("Mathmetics");
        cr.setCourseCode("5235");
        
        Department dpmt = new Department();
        dpmt.setDepartmentName("Computer Science");
        dpmt.setDepartmentBuilding("Builidng 5");
        
        Student st = new Student();
        st.setStudentName("Shamim Sarder");
        st.setStudentId("5698745236");
        
        ArrayList<BasicInformation> basic = new ArrayList<>();
        basic.add(cr);
        basic.add(dpmt);
        basic.add(st);
        
        for(BasicInformation x: basic){
            System.out.println(x.BasicInfo());
            
    }

	}

}
