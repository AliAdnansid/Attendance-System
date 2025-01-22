/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Classes;
import java.sql.*;
/**
 *
 * @author PC
 */
public interface DAO_Education {
    void insertStoredProcedureIntoStudent(String studentName, String studentEmail, String studentAddress, String studentPhoneNo) throws SQLException;
    void deleteStoredProcedureIntoStudent(int studentID) throws SQLException;

    // Teacher CRUD Operations (Create and Delete)
    void insertStoredProcedureIntoTeacher(String teacherName, String teacherDepartment, double teacherSalary, String teacherAddress, String teacherPhoneNo) throws SQLException;
    void deleteStoredProcedureIntoTeacher(int teacherID) throws SQLException;

    // Course CRUD Operations (Create and Delete)
    void insertStoredProcedureIntoCourse(String courseName, String courseDepartment, int courseCreditHour) throws SQLException;
    void deleteStoredProcedureIntoCourse(int courseID) throws SQLException;

    // Section CRUD Operations (Create and Delete)
    void insertStoredProcedureIntoSection(String sectionName, int teacherID, int slotNo, String sectionDay) throws SQLException;
    void deleteStoredProcedureIntoSection(int sectionID) throws SQLException;

}
