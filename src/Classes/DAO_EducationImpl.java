/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author PC
 */
import java.sql.*;

public  class DAO_EducationImpl implements DAO_Education {


    @Override
    public void insertStoredProcedureIntoStudent(String studentName, String studentEmail, String studentAddress, String studentPhoneNo) throws SQLException {
        Connection con = database.getConnection();
        String query = "{call AddStudent(?, ?, ?, ?)}"; 

        try (CallableStatement stmt = con.prepareCall(query)) {
            stmt.setString(1, studentName);
            stmt.setString(2, studentEmail);
            stmt.setString(3, studentAddress);
            stmt.setString(4, studentPhoneNo);
            stmt.executeUpdate();
            System.out.println("Student added successfully!");
        }
    }

    @Override
    public void deleteStoredProcedureIntoStudent(int studentID) throws SQLException {
        Connection con = database.getConnection();
        String query = "{call DeleteStudent(?)}"; 

        try (CallableStatement stmt = con.prepareCall(query)) {
            stmt.setInt(1, studentID);
            stmt.executeUpdate();
            System.out.println("Student deleted successfully!");
        }
    }

    @Override
    public void insertStoredProcedureIntoTeacher(String teacherName, String teacherDepartment, double teacherSalary, String teacherAddress, String teacherPhoneNo) throws SQLException {
        Connection con = database.getConnection();
        String query = "{call AddTeacher(?, ?, ?, ?, ?)}"; 

        try (CallableStatement stmt = con.prepareCall(query)) {
            stmt.setString(1, teacherName);
            stmt.setString(2, teacherDepartment);
            stmt.setDouble(3, teacherSalary);
            stmt.setString(4, teacherAddress);
            stmt.setString(5, teacherPhoneNo);
            stmt.executeUpdate();
            System.out.println("Teacher added successfully!");
        }
    }

    @Override
    public void deleteStoredProcedureIntoTeacher(int teacherID) throws SQLException {
        Connection con = database.getConnection();
        String query = "{call DeleteTeacher(?)}"; 

        try (CallableStatement stmt = con.prepareCall(query)) {
            stmt.setInt(1, teacherID);
            stmt.executeUpdate();
            System.out.println("Teacher deleted successfully!");
        }
    }

    @Override
    public void insertStoredProcedureIntoCourse(String courseName, String courseDepartment, int courseCreditHour) throws SQLException {
        Connection con = database.getConnection();
        String query = "{call AddCourse(?, ?, ?)}"; 

        try (CallableStatement stmt = con.prepareCall(query)) {
            stmt.setString(1, courseName);
            stmt.setString(2, courseDepartment);
            stmt.setInt(3, courseCreditHour);
            stmt.executeUpdate();
            System.out.println("Course added successfully!");
        }
    }

    @Override
    public void deleteStoredProcedureIntoCourse(int courseID) throws SQLException {
        Connection con = database.getConnection();
        String query = "{call DeleteCourse(?)}";

        try (CallableStatement stmt = con.prepareCall(query)) {
            stmt.setInt(1, courseID);
            stmt.executeUpdate();
            System.out.println("Course deleted successfully!");
        }
    }

    @Override
    public void insertStoredProcedureIntoSection(String sectionName, int teacherID, int slotNo, String sectionDay) throws SQLException {
        Connection con = database.getConnection();
        String query = "{call AddSection(?, ?, ?, ?)}"; 

        try (CallableStatement stmt = con.prepareCall(query)) {
            stmt.setString(1, sectionName);
            stmt.setInt(2, teacherID);
            stmt.setInt(3, slotNo);
            stmt.setString(4, sectionDay);
            stmt.executeUpdate();
            System.out.println("Section added successfully!");
        }
    }

    @Override
    public void deleteStoredProcedureIntoSection(int sectionID) throws SQLException {
        Connection con = database.getConnection();
        String query = "{call DeleteSection(?)}"; 

        try (CallableStatement stmt = con.prepareCall(query)) {
            stmt.setInt(1, sectionID);
            stmt.executeUpdate();
            System.out.println("Section deleted successfully!");
        }
    }
}

