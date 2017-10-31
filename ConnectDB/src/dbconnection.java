

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ecedeno
 */
public class dbconnection {
    
    String host = "localhost";
    String bd = "itla";
    String user = "root";
    String pasword = "123456";
    Connection conn;
    
    
   public void  connect() throws SQLException{
       
       String url = "jdbc:mysql://"+host+"/" + bd + "?user="+user+"&password="
               +pasword;
   
       conn = DriverManager.getConnection(url);
       
      
   }      
    
   public void disconect() throws SQLException{
       
       if (conn != null){
           
           conn.close();
       
       }
   
   }
      
   
}
