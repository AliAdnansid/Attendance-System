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
public class University {
    private static String universityId;
    private static String name;
    private static String location;
    private static ArrayList<Student> students;
    public static ArrayList<Teacher> teachers;
    private static ArrayList<Course> courses;
    private static ArrayList<Section> sections;

    // Constructor
    public University() {
        this.universityId = "1";
        this.name = "Avengers";
        this.location = "New York, USA" ;
        teachers = new ArrayList<>();
    }

    // Methods
    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public static ArrayList<Course> getCourses() {
        return courses;
    }

    public static ArrayList<Section> getSections() {
        return sections;
    }
    
    public static String printUniInfo(){
        return "University name is "+name+". It is loacated in "+location+". ";
    }
    
    public static void dummyValues(){
        for (int i = 0; i < 5; i++) {
            teachers.add(new Teacher("123"+i, "dummy", -0, "dummy", "dummy", "dummy"));
        }
    }
    
    public static void addmissionOfStudent(Student s){
        students.add(s);
    }
    
    public static void addmissionOfTeacher(Teacher t){
        teachers.add(t);
    }
}