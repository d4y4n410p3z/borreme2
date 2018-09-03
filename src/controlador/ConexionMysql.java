package controlador;

/*
 * MyDBConnection.java
 *
 * Created on 2005/01/16, 10:50
 */

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author noniko
 */
public class ConexionMysql{
   
    private Connection myConnection;
    
    /** Creates a new instance of MyDBConnection */
    public ConexionMysql() {

    }

    public void IniciarConexion(){
    
       try{
        
        Class.forName("com.mysql.jdbc.Driver");
        myConnection=DriverManager.getConnection("jdbc:mysql://localhost/tintosalud","root", "");
        }
        catch(Exception e){
     //       System.out.println("Failed to get connection");
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la conexion a BD");
        }
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