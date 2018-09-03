package reportes;
// EJEMPLO ACR..........................
/*
 * MyDBConnection.java
 *
 * Created on 2005/01/16, 10:50
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author noniko
 */
public class ConexionReporte{
   
    Connection myConnection;
    
    /** Creates a new instance of MyDBConnection */
    public ConexionReporte() {
 try{
        
        Class.forName("com.mysql.jdbc.Driver");
        myConnection=DriverManager.getConnection("jdbc:mysql://localhost/tintosalud","root", "123");
        
      
        }
        catch(Exception e){
            System.out.println("Failed to get connection");
            e.printStackTrace();
        }
    }

    public void IniciarConexion(){
    
      
    }
    
    
    public Connection getMyConnection(){
        return myConnection;
    }
    
    
    public void Close(ResultSet rs){
        
        if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        
        }
    }
    
     public void Close(java.sql.Statement stmt){
        
        if(stmt !=null){
            try{
               stmt.close();
            }
            catch(Exception e){}
        
        }
    }
     
  public void Cerrar(){
  
    if(myConnection !=null){
    
         try{
               myConnection.close();
            }
            catch(Exception e){}
        
        
    }
  }
    
}