/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;
import ManagementSystem.Home;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author NEW
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentresultsystem","root","maMu @ 5577");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
            return null;
        }
    }
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        /* Create and display the form */
       ConnectionProvider obj=new ConnectionProvider();
       Connection c=obj.getCon();
    }
}
