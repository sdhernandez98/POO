/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlnota;

/**
 *
 * @author santi
 */
public class Teacher extends Usuario {
    private String institucionalEmail; 
    private String workArea;

    public Teacher(String institucionalEmail, String workArea, String fullname, int dni) {
        super(fullname, dni);
        this.institucionalEmail = institucionalEmail;
        this.workArea = workArea;
    }
    public void consultGrade(){
        
    }
    public void changeGrade(){
        
    }

    /**
     * @return the institucionalEmail
     */
    public String getInstitucionalEmail() {
        return institucionalEmail;
    }

    /**
     * @param institucionalEmail the institucionalEmail to set
     */
    public void setInstitucionalEmail(String institucionalEmail) {
        this.institucionalEmail = institucionalEmail;
    }

    /**
     * @return the workArea
     */
    public String getWorkArea() {
        return workArea;
    }

    /**
     * @param workArea the workArea to set
     */
    public void setWorkArea(String workArea) {
        this.workArea = workArea;
    }
    
    
    
    
}
