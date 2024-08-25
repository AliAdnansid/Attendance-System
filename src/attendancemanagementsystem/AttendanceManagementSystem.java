/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package attendancemanagementsystem;

import Classes.Attendance;
import Classes.University;
import Designs.starting;
import Designs.welcomeScreen;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ali
 */
public class AttendanceManagementSystem {

    public static void main(String[] args) {
        
        University.dummyValues();
        welcomeScreen welcome = new welcomeScreen();
        welcome.setVisible(true);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        welcome.setVisible(false);
        starting start = new starting();
        start.setVisible(true);
        
    }
    
}
