package vista;

// EJEMPLO PARA ADSI
//import com.mysql.jdbc.Connection;
// este ejemplo uso una parte de codigo disponible en : https://netbeans.org/project_downloads/www/MyDBConnection.java
import modelo.Pacientes;
import controlador.ConexionMysql;
import java.sql.CallableStatement;
//import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvaro
 */
public class AgregarDoctoresProced extends javax.swing.JInternalFrame {
//Connection puente = null;
  public static Connection connection; 
  //public static Statement sentencia;  
    /**
     * Creates new form AgregarPacientes
     */



    public AgregarDoctoresProced() throws SQLException {
         
        
        initComponents();

                
        
            }
public void limpiarcajas()
{
    CajitaIdDoctor.setText("");
    CajitaNomDoctor.setText("");
    CajitaApeDoctor.setText("");        
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CajitaIdDoctor = new javax.swing.JTextField();
        CajitaNomDoctor = new javax.swing.JTextField();
        CajitaApeDoctor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnInsertar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("AGREGAR DOCTORES USANDO PROCEDIMIENTO");

        jLabel1.setText("ID DOCTOR");

        jLabel2.setText("NOMBRE DOCTOR");

        jLabel3.setText("APELLIDO DOCTOR");

        BtnInsertar.setText("AGREGAR DOCTOR");
        BtnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CajitaIdDoctor)
                        .addComponent(CajitaNomDoctor)
                        .addComponent(CajitaApeDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                    .addComponent(BtnInsertar))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajitaIdDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajitaNomDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CajitaApeDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addComponent(BtnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertarActionPerformed
        
      try {
         // ESTABLECE UNA CONEXION 
         ConexionMysql ConectBD=new ConexionMysql();
         
         
        // Statement sentencia;
         ConectBD.IniciarConexion();
         Connection conn=ConectBD.getMyConnection();
         
         CallableStatement sentenciaCargada = conn.prepareCall("{call AGREGAR_DOCTOR(?,?,?)}");
         /*
         sentencia= conn.createStatement();
         sentencia.executeUpdate("insert into Pacientes(IdPaciente,NomPaciente,ApePaciente,Estado)"
                 + " value ('"+CajitaIdpaciente.getText()+"','"+CajitaNomPaciente.getText()+""
                         + "','"+CajitaApePaciente.getText()+"','ACTIVO');");    
         */ 
         
       //  sentenciaCargada.registerOutParameter(CajitaIdpaciente.getText(), java.sql.Types.VARCHAR);
         sentenciaCargada.setString(1,CajitaIdDoctor.getText()); // .registerOutParameter(CajitaIdpaciente.getText(), java.sql.Types.VARCHAR);
         sentenciaCargada.setString(2,CajitaNomDoctor.getText());
         sentenciaCargada.setString(3,CajitaApeDoctor.getText());
         sentenciaCargada.execute();
         
         JOptionPane.showMessageDialog(null,"El Doctor "+ CajitaIdDoctor.getText() +" fue almacenado");
         ConectBD.Cerrar();
         limpiarcajas();
      } catch (SQLException ex) {
          Logger.getLogger(AgregarDoctoresProced.class.getName()).log(Level.SEVERE, null, ex);
      }
        
   
    }//GEN-LAST:event_BtnInsertarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnInsertar;
    private javax.swing.JTextField CajitaApeDoctor;
    private javax.swing.JTextField CajitaIdDoctor;
    private javax.swing.JTextField CajitaNomDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
