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
public class Teacher extends Person{
    
    private String teacherId;
    private String department;
    private double salary;
    private ArrayList<Section> coursesTaiught;

    public ArrayList<Section> getCoursesTaiught() {
        return coursesTaiught;
    }

    public void setCoursesTaiught(ArrayList<Section> coursesTaiught) {
        this.coursesTaiught = coursesTaiught;
    }
    
    public Teacher(String teacherId, String department, double salary, String name, String phone_no, String address){
        super(name, address, phone_no);
        this.department = department;
        this.salary = salary;
        this.teacherId = teacherId;
    }
    
    public String getTeacherId() {
        return teacherId;
    }

    public Teacher(){
        super();
    }
    
    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}

