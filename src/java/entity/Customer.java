/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Fincode
 */


public class Customer {
     
    private String name;
    
    private String gender;
    
    private String location;
    
    public Customer(String name, String gender, String location){
        this.name= name;
        this.gender=gender;
        this.location=location;
    }
    
    public Customer() {
    
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getLocation() {
        return this.location;
    }
    
}
