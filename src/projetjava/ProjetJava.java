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
public class ProjetJava {

    public static void main(String[] args) {
        // TODO code application logic here
    //AddClient ac=new ListeClients();
    //ac.setSize(500, 200);
    //ac.setVisible(true);
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new desti2().setVisible(true);
            }
        });

    //InsererClient ic = new InsererClient();
    }
    //String[] column = {"Name", "Prenom"};
    
    

}
