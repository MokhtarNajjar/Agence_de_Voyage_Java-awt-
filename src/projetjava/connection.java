/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author Mokh
 */
public class connection {
public connection(){
    String url = "jdbc:mysql://localhost:3306/bd";
String login="root";
String password="";
try {
// Etape 1 – Chargement du driver
Class.forName("com.mysql.jdbc.Driver");
// Etape 2 – Connexion à la base
Connection con = DriverManager.getConnection(url, login, password);
// Etape 3 – Création du curseur Statement
Statement stmt = con.createStatement();
/*
ResultSet rs = stmt.executeQuery("Select * from MyTable");
// Accès aux métadonnées
ResultSetMetaData rsmd = rs.getMetaData();
int nbColonnes = rsmd.getColumnCount();
for(int i = 1; i <= nbColonnes; i++)
System.out.print(" "+ rsmd.getColumnName(i));
//Etape 5 – Exploitation des résultats
while (rs.next()) {
int resultat1 = rs.getInt("cin");
String resultat2 = rs.getString("nom");
//…
System.out.println(" cin : "+ resultat1 +" Nom : "+ resultat2 );
}


rs.close();
*/
//stmt.close();
//con.close();

} // terminer le try
catch (Exception e) {
System.out.println(" Attention l'exception : " + e + "est arrivée");
 // fin de la capture de l'exception
}

}
}
