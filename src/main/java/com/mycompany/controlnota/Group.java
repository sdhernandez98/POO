/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlnota;

/**
 *
 * @author santi
 */
public class Group {
    private int  codeGroup;
    private String stripe;

    public Group(int codeGroup, String stripe) {
        this.codeGroup = codeGroup;
        this.stripe = stripe;
    }
    
    
    /**
     * @return the codeGroup
     */
    public int getCodeGroup() {
        return codeGroup;
    }

    /**
     * @param codeGroup the codeGroup to set
     */
    public void setCodeGroup(int codeGroup) {
        this.codeGroup = codeGroup;
    }

    /**
     * @return the stripe
     */
    public String getStripe() {
        return stripe;
    }

    /**
     * @param stripe the stripe to set
     */
    public void setStripe(String stripe) {
        this.stripe = stripe;
    }
    
}
