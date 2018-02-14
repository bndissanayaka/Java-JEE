package com.wisdom.bean;


import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import com.wisdom.entity.Student;
import com.wisdom.manager.DBHandler;
 
@ManagedBean(name = "courseBean")
public class CourseBean {
         
    private String[] selectedCities;   
    private List<String> cities;
     
    @PostConstruct
    public void init() {
        cities = new ArrayList<String>();
        cities.add("Miami");
        cities.add("London");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Barcelona");
        cities.add("Rome");
        cities.add("Brasilia");
        cities.add("Amsterdam");
    }
 
    public String[] getSelectedCities() {
        return selectedCities;
    }
 
    public void setSelectedCities(String[] selectedCities) {
        this.selectedCities = selectedCities;
    }
 
    public List<String> getCities() {
        return cities;
    }
    
    public void submitCourseData()
	{
    	System.out.println(getSelectedCities());
		/*Student student = new Student();

		student.setStuid(stuid);
		student.setfName(firstName);
		student.setlName(lastName);
		student.setDob(dob);
		student.setNic(nic);
		student.setEmail(email);
		student.setTelno(telno);
		student.setAddress(address);
		
		DBHandler dbHandler = new DBHandler();
		dbHandler.saveStudent(student);*/
		
	}
	
}