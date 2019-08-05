/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetjava;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsererClient extends Frame implements ActionListener{

        private Label l1;
private TextField tf1;
private Label l2;
private TextField tf2,tf3,tf4,tf5;
private Button b1 ;
private Label l3,l4,l5,l6;

  public InsererClient(){
 super ("Add Client"); //Le container
setLayout(new FlowLayout());
setSize(300,400);
l1 = new Label("\n Votre Cin SVP :\n"); add(l1);
tf1 = new TextField(25);add(tf1);
l2 = new Label("\n  Nom du Client :"); add(l2);
tf2 = new TextField(5); add(tf2);
l6 = new Label(" "); add(l6);

l4 = new Label("\n Prenom du Client  :"); add(l4);
tf3 = new TextField(25);add(tf3);
l5 = new Label("Age du Clinet :"); add(l5);
tf4 = new TextField(25);add(tf4);
b1= new Button("Ajouter au Base de Données "); add(b1);

setVisible(true);
b1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
