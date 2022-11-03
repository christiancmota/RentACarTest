/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc.yoursolution;

import java.util.List;
import ooc.enums.Make;
import ooc.enums.Month;

/**
 *
 * @author furta
 */
public class RentACar implements RentACarInterface {
    
    private String name;
    private int numberOfCars;
    

    @Override
    public List<CarInterface> getCars() {
        
    }

    @Override
    public void setCars(List<CarInterface> cars) {
        
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean checkAvailability(Month month, int day, Make make, int lengthOfRent) {
        
    }

    @Override
    public int getCarAvailable(Month month, int day, Make make, int lengthOfRent) {
        
    }

    @Override
    public boolean bookCar(Month month, int day, Make make, int lengthOfRent) {
        
    }

    @Override
    public int getNumberOfCars() {
        return numberOfCars;
    }
    
}
