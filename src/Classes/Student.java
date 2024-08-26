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
    String studentEmail;
    private ArrayList<CourseEnrollment> enrollments;
    private ArrayList<Attendance> attendance;

    public Student(String studentId, String studentEmail, String name, String address, String phone_no) {
        super(name, address, phone_no);
        this.studentId = studentId;
        this.studentEmail = studentEmail;
    }    

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
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
