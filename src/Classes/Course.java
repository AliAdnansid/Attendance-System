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
    private ArrayList<CourseEnrollment> enrollments;
    private ArrayList<Section> sections;

    public Course(String name, String courseId) {
        this.name = name;
        this.courseId = courseId;
  
    }

    public ArrayList<CourseEnrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(ArrayList<CourseEnrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }
    
    public Course(){
        
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
    
     
}
