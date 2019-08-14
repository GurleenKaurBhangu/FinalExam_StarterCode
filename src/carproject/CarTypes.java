/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

/**
 *
 * @author srinivsi
 */
public class CarTypes 
{
   public CarProject createCar(String type)
    {
        CarProject car = null;
        if(type.equals("BMW"))
        {
            car = new BMW();
        }
        else if (type.equals("Volvo"))
        {
                car= new Volvo();
        }
        return car;
    }
}  
