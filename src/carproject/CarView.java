/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.util.Scanner;

/**
 * Question for Final Exam Part D
 * @author Sivagama Srinivasan 
 */
public class CarView 
{
public static CarManufactureLocation Brampton = new CarManufactureLocation();//we only ever want one 
   // of these. The Car manufacture unit is located only in one location Brampton 
   //and all cars are manufactured in the same location.
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Car shop");
        System.out.println("What kind of Car do you want?");
        System.out.println("Please enter exactly BMW or Volvo");
        String type = sc.nextLine();
        CarTypes pf = new CarTypes();
        CarProject car= pf.createCar(type);
        System.out.println("how many cars would you like?");
        int numofcars = sc.nextInt();
        Brampton.numofcars=numofcars;
        if (car!=null)
        {
            System.out.println("Great job, here is your order for " + numofcars + " cars");
            
        }
        else
        {
            System.out.println("Enter a valid Car type");
        }
        
    }//end main    
}
    

