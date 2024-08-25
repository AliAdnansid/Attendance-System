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
public class Student extends Person {
    
    String studentId;
    String studentEmainl;
    private ArrayList<CourseEnrollment> enrollments;
    private ArrayList<Attendance> attendance;

    public Student(String studentId, String studentEmainl, String name, String address, String phone_no) {
        super(name, address, phone_no);
        this.studentId = studentId;
        this.studentEmainl = studentEmainl;
    }    

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentEmainl() {
        return studentEmainl;
    }

    public void setStudentEmainl(String studentEmainl) {
        this.studentEmainl = studentEmainl;
    }

    public ArrayList<CourseEnrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(ArrayList<CourseEnrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public ArrayList<Attendance> getAttendance() {
        return attendance;
    }

    public void setAttendance(ArrayList<Attendance> attendance) {
        this.attendance = attendance;
    }
    
    
   
    
}
