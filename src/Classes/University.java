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
        
    }

    // Methods
    
    static {
        universityId = "1";
        name = "Avengers";
        location = "New York, USA" ;
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        courses = new ArrayList<>();
        sections = new ArrayList<>();
    }
    
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
    
    public static Teacher getTeacher(int i){
        return teachers.get(i);
    }
    
    public static void removeTeacher(int i){
        teachers.remove(i);
    }
    
    public static Student getStudent(int i){
        return students.get(i);
    }
    
    public static void removeStudent(int i){
        students.remove(i);
    }
    
    public static Course getCourse(int i){
        return courses.get(i);
    }
    
    public static void removeCourse(int i){
        courses.remove(i);
    }
    
    public static void addmissionOfCourse(Course t){
        courses.add(t);
    }
    
    public static Course searchCourse(String key){
        
        for (int i = 0; i < courses.size(); i++) {
            if(courses.get(i).getCourseId().equals(key)){
                return courses.get(i);
            }
        }
        return null;
        
    }
    
    public static Teacher getTeacherByName(String key){
        for (int i = 0; i < teachers.size(); i++) {
            if(teachers.get(i).getName().equalsIgnoreCase(key)){
                return teachers.get(i);
            }
        }
        return null;
    }
}
