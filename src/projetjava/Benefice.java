/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetjava;

/**
 *
 * @author Mokh
 */
public class Benefice {
String destination;
int benifice;

public Benefice(String a, int b)
    {this.destination=a;
    this.benifice=b;
    }
public String getDes()
{return this.destination;}

public int  getben()
{return this.benifice;}
}

