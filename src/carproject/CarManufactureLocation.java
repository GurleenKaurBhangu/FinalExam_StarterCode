/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

/** A class that manufactures car.
 * We only ever want one manufacturing location to make 
 * cars to ensure consistency.
 * Users can order the number of car they want to buy
 * @author Sivagama Srinivasan
  August,2022 */
public class CarManufactureLocation {
  private CarManufactureLocation ()
  {
  }
  private CarManufactureLocation object;
  public int numofcars = 0;// how many orders to manufacture car
  public static CarManufactureLocation getInstance()
  {
    if(object==null)
    {
      object = new CarManufactureLocation();
    }
    return object
    }
}
   
 
