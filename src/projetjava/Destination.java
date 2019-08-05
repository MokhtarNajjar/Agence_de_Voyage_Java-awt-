/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetjava;

import java.util.HashMap;

/**
 *
 * @author Mokh
 */
public class Destination {
String Nom;
double Prix ;
String Periode;
HashMap<String, Integer> destination = new HashMap<String, Integer>();    

    public Destination(HashMap<String, Integer> hp)
    {
        hp=this.destination;
    }
public HashMap<String, Integer> mylist()
        {
HashMap<String, Integer> destination = new HashMap<String, Integer>();    
destination.put("Tunisie", 800);
destination.put("Istanbul", 1800);
destination.put("Bangkok", 2650);
        return destination;
        }
}
