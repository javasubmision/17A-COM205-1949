/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author FALAYE SEYI
 */
public class quesClass {
    static String name, gender, dob, mob, yob, faculty, department, university;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        quesClass.name = name;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        quesClass.gender = gender;
    }

    public static String getDob() {
        return dob;
    }

    public static void setDob(String dob) {
        quesClass.dob = dob;
    }

    public static String getMob() {
        return mob;
    }

    public static void setMob(String mob) {
        quesClass.mob = mob;
    }

    public static String getYob() {
        return yob;
    }

    public static void setYob(String yob) {
        quesClass.yob = yob;
    }

    public static String getFaculty() {
        return faculty;
    }

    public static void setFaculty(String faculty) {
        quesClass.faculty = faculty;
    }

    public static String getDepartment() {
        return department;
    }

    public static void setDepartment(String department) {
        quesClass.department = department;
    }

    public static String getUniversity() {
        return university;
    }

    public static void setUniversity(String university) {
        quesClass.university = university;
    }
    
    public static void write() throws IOException
    {
        try(BufferedWriter regFile = new BufferedWriter(new FileWriter("staff.txt", true)))
        {
        regFile.write(getName() + " " + getGender()+ " " + getDob()+ "/" +getMob()+ "/" +getYob()+ " " +getFaculty()+ " " +getDepartment()+ " " +getUniversity());
        regFile.newLine();
        }
    }
    
}
