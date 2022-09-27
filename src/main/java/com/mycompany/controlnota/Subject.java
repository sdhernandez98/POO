/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlnota;

/**
 *
 * @author santi
 */
public class Subject {
    private String name; 
    private String code;
    private int credits; 

    @Override
    public String toString() {
        return "Subject{" + "name=" + name + ", code=" + code + ", credits=" + credits + '}';
    }
    

    public Subject(String name, String code, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the credits
     */
    public int getCredits() {
        return credits;
    }

    /**
     * @param credits the credits to set
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
    
   
}
