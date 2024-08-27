/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Ali
 */
public class Course {
   
    private String name;
    private String courseId;
    private String department;
    private int creditHours;
    private ArrayList<Section> sections;

    public Course(String name, String courseId) {
        this.name = name;
        this.courseId = courseId;
  
    }

    public Course(){
        
    }
    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    } 
    
    public Course(String name, String courseId, String department, int creditHours) {
        this.name = name;
        this.courseId = courseId;
        this.department = department;
        this.creditHours = creditHours;
    }
    
    public Section getSection(int i){
        return sections.get(i);
    }
}
