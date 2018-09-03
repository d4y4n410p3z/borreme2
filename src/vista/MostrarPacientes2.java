package vista;

// EJEMPLO PARA ADSI
//import com.mysql.jdbc.Connection;
import controlador.ConexionMysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvaro
 */
public class MostrarPacientes2 extends javax.swing.JInternalFrame {

public String comandosql="Select * from Pacientes";
DefaultTableModel modeloejemplo; // Para configurar la tabla que se creo
 String NombresColumnas[]= new String[] {"CEDULA PACIENTE","NOMBRE PACIENTE","APELLIDO PACIENTE"};
//  String NombresColumnas[]= new String[] {"ID","NOMBRES","APELLIDOS","ESTADO"};
 
    public MostrarPacientes2() throws SQLException {
  
     modeloejemplo= new DefaultTableModel(null,NombresColumnas);
        initComponents();
     //llenarTabla();
     MostrarInformacion();
            }
  

    /**
     * Creates new form AgregarPacientes
     */
public void limpiarTabla()
{ int i,j=0,nfilas;
  nfilas=modeloejemplo.getRowCount();
  System.out.println("el numero de filas detectadas es" + nfilas);
  for(i=0;i<nfilas;i++)
  { modeloejemplo.removeRow(j); // borra la primera fila y despues de cada borrado
    System.out.println("vamos en el borrado "+i); // la primera fila cambia y sigue hasta 
  }      // borrar todas las filas de la tabla
    
        nfilas=modeloejemplo.getRowCount();
        etiNumFilas.setText("Hay "+nfilas+" registros en la tabla");    
}        

public void MostrarInformacion()
{
    
    int nFilas=0;
//    Cajon.setText("");
try {
         ConexionMysql ConectBD=new ConexionMysql();
         Statement sentencia; // st
         ResultSet resultado; //rs 
         Object nuevafila[]= new Object[4]; // 4 por que son 4 las columnas que tiene la tabla.
         
         ConectBD.IniciarConexion();
         Connection conn=ConectBD.getMyConnection();
         sentencia= conn.createStatement();
         
        // JOptionPane.showMessageDialog(null,"La consulta sera"+comandosql);
         resultado = sentencia.executeQuery(comandosql);
         ResultSetMetaData meta = resultado.getMetaData();
         int columnas = meta.getColumnCount();  //Mientras haya registros 
         System.out.println("aqui vamos...");
         
         while (resultado.next()) 
         {  System.out.println("estoy dentro del while");
           /*
            nuevafila[0]=resultado.getObject(1);
            nuevafila[1]=resultado.getObject(2);
            nuevafila[2]=resultado.getObject(3);
            nuevafila[3]=resultado.getObject(4); */
            for (int i = 0; i < columnas; i++) 
                {nuevafila[i]=resultado.getObject(i+1);
                
                }        
                
                modeloejemplo.addRow(nuevafila);
                System.out.println("fin del for");
                 
         }
         ConectBD.Cerrar();
        nFilas=modeloejemplo.getRowCount();
        etiNumFilas.setText("Hay "+nFilas+" registros en la tabla");
 //        JOptionPane.showMessageDialog(null,"La consulta fue realizada");
      } catch (SQLException ex) {
          Logger.getLogger(AgregarPacientes.class.getName()).log(Level.SEVERE, null, ex);
      }

}

 



   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrdenId = new javax.swing.JButton();
        btnOrdenNombre = new javax.swing.JButton();
        btnOrdenApellido = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        etiNumFilas = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("MOSTRAR PACIENTES");

        btnOrdenId.setText("POR ID");
        btnOrdenId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenIdActionPerformed(evt);
            }
        });

        btnOrdenNombre.setText("POR NOMBRE");
        btnOrdenNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenNombreActionPerformed(evt);
            }
        });

        btnOrdenApellido.setText("POR APELLIDO");
        btnOrdenApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenApellidoActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerDateModel());

        jTable1.setBackground(new java.awt.Color(102, 204, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 102));
        jTable1.setModel(modeloejemplo);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("LIMPIAR TABLA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        etiNumFilas.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrdenId)
                            .addComponent(etiNumFilas))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrdenNombre)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnOrdenApellido))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrdenId)
                    .addComponent(btnOrdenNombre)
                    .addComponent(btnOrdenApellido))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(etiNumFilas))))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenNombreActionPerformed
        comandosql="Select * from Pacientes order by nombrePaciente";
     //   modeloejemplo.
     limpiarTabla();   
     MostrarInformacion();
    }//GEN-LAST:event_btnOrdenNombreActionPerformed

    private void btnOrdenIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenIdActionPerformed
       comandosql="Select * from Pacientes order by idPaciente";
       limpiarTabla(); 
       MostrarInformacion();
    }//GEN-LAST:event_btnOrdenIdActionPerformed

    private void btnOrdenApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenApellidoActionPerformed
        comandosql="Select * from Pacientes order by apellidoPaciente";
        limpiarTabla();
        MostrarInformacion();
    }//GEN-LAST:event_btnOrdenApellidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        limpiarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int filaElegida;
        //modeloejemplo.getValueAt(ERROR, WIDTH)
      //  filaElegida=modeloejemplo   
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenApellido;
    private javax.swing.JButton btnOrdenId;
    private javax.swing.JButton btnOrdenNombre;
    private javax.swing.JLabel etiNumFilas;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


}