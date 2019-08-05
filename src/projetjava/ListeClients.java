/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetjava;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Mokh
 */
public class ListeClients extends JFrame {
    
   
    String[] column = {"Name", "Prenom","age"};
   JTable table; 
    public ListeClients()
    {
    Object [][] data = {
        {"mokh","lll", "dkd"},
       {"mokh","lll", "dkd"}
       
    }; 
    
table = new JTable(data, column);
   
JScrollPane scrollpane = new JScrollPane(table);
scrollpane.setPreferredSize(new Dimension(500,300));
setTitle("Mon exemple JTable");
getContentPane().add(scrollpane);
add(scrollpane);
table.setSize(500, 200);
table.setVisible(true);


    }
    


}
