/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.Map;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author furta
 */
public class Car implements CarInterface {

   Make make;
   Month month;
   private int id;
   private boolean available;
   private double rate;
    
    
    @Override
    public Map<Month, boolean[]> createAvailability() {
        
        
       
    }

    @Override
    public Make getMake() {
        return this.make;
        
    }

    @Override
    public void setMake(Make make) {
         this.make = make;
        
    }

    @Override
    public double getRate() {
        return this.rate;
        
    }

    @Override
    public void setRate(double rate) {
        this.rate = rate;
        
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        
        
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
        
        
    }

    @Override
    public int getId() {
        return this.id;
        
    }

    @Override
    public boolean isAvailable(Month month, int day) {
        return available;
        
    }

    @Override
    public boolean book(Month month, int day) {
        
        
    }
    
}
