/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
  April,2020 */
package carproject;

import java.util.ArrayList;

/**
 * August 12th
 * @author srinivsi
 */
public class CarProject
{
public String shopName= "Sheridan";
    private ArrayList<String> luxuryparts = new ArrayList();
    
    public void load(String parts) 
        {
	luxuryparts.add(parts);
        }

	
	public void label(String label) 
        {
	shopName=label;
        }
       
}
