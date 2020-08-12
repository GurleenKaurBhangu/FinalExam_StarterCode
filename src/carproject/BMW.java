/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

/**
 *  A class to model car BMW
 * @author Sivagama Srinivasan
2020 */
public class BMW extends CarProject
{
  
    public BMW()
    {
        super();
        super.load("self drive");
    }
    public void Label(String label)
    {
       super.shopName = label;
        //do some labelling here, code not implemented yet
        //not necessary for the review
    }
    
}

      

