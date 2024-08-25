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
public class Section {
    
    private String name;
    private String day;
    private String room;
    private int slotNo;
    private Teacher instructor;
    private Course course;
    private ArrayList<Student> studentsInSection;

    public Section(String name, String day, String room, int slotNo, Teacher instructor, Course course) {
        this.name = name;
        this.day = day;
        this.room = room;
        this.slotNo = slotNo;
        this.instructor = instructor;
        this.course = course;
 
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Student> getStudentsInSection() {
        return studentsInSection;
    }

    public void setStudentsInSection(ArrayList<Student> studentsInSection) {
        this.studentsInSection = studentsInSection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }
    
    
}

