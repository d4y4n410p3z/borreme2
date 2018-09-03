package vista;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import javax.swing.JOptionPane;
//import net.sf.jasperreports.engine.JRException;


public class Padre extends javax.swing.JFrame {
AgregarPacientes AgrePac;
AgregarPacientesProced AgrePacProce;
AgregarDoctoresProced AgreDocProce;
MostrarPacientes1 mosPac1;
MostrarPacientes2 mosPac2;
ActualizarPacientes actuPac;
MostrarDoctores mosDoc;
AgregarCita agreCita;


public Padre() {
        initComponents();
     //   this.setExtendedState(MAXIMIZED_BOTH);
        
        /* ESTADOS DEL JFRAME AL INICIAR LA EJECUCION
          NORMAL: Inicializa el JFrame en estado Normal
          ICONIFIED: Inicializa el JFrame en estado Minimizado.
          MAXIMIZED_HORIZ: Inicializa el JFrame en estado Maximizado Horizontalmente
          MAXIMIZED_VERT: Inicializa el JFrame en estado Maximizado Verticalmente
          MAXIMIZED_BOTH: Inicializa el JFrame en estado Maximizado en ambos sentidos
        */
    }


@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Pane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnAddPaciente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BtnMostrarPacientes = new javax.swing.JButton();
        BtnAddPaciente = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        MenuRealizarConsulta = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        AgregarPacientes = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menu_actualizar_pacientes = new javax.swing.JMenuItem();
        menuReportePacientes = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menu_agregar_doctores = new javax.swing.JMenuItem();
        menu_mostrar_doctores = new javax.swing.JMenuItem();
        reporteDoctores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menu_agregar_cita = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MenuAcercade = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EPS - TINTOSALUD");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tintosalud_logo_reportes.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        Pane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout Pane1Layout = new javax.swing.GroupLayout(Pane1);
        Pane1.setLayout(Pane1Layout);
        Pane1Layout.setHorizontalGroup(
            Pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pane1Layout.setVerticalGroup(
            Pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);

        btnAddPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AgregarPersona.png"))); // NOI18N
        btnAddPaciente.setToolTipText("Aqui se agregaran los pacientes");
        btnAddPaciente.setFocusable(false);
        btnAddPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPacienteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAddPaciente);
        jToolBar1.add(jSeparator1);

        BtnMostrarPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/BuscarPersona.png"))); // NOI18N
        BtnMostrarPacientes.setToolTipText("Aqui se mostraran los pacientes");
        BtnMostrarPacientes.setFocusable(false);
        BtnMostrarPacientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnMostrarPacientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnMostrarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarPacientesActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnMostrarPacientes);

        BtnAddPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AgregarPersona.png"))); // NOI18N
        BtnAddPaciente.setToolTipText("Esta es la ayuda");
        BtnAddPaciente.setFocusable(false);
        BtnAddPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnAddPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnAddPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddPacienteActionPerformed(evt);
            }
        });
        jToolBar1.add(BtnAddPaciente);
        jToolBar1.add(jSeparator2);
        jToolBar1.add(jSeparator3);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ayuuuda.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jMenu1.setText("Pacientes");

        AgregarPacientes.setText("Agregar");
        AgregarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPacientesActionPerformed(evt);
            }
        });
        jMenu1.add(AgregarPacientes);

        jMenuItem4.setMnemonic('g');
        jMenuItem4.setText("Agregar con Procedure");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setText("Mostrar en TextArea");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Mostrar en Table Model");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        menu_actualizar_pacientes.setText("Actualizar Pacientes");
        menu_actualizar_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_actualizar_pacientesActionPerformed(evt);
            }
        });
        jMenu1.add(menu_actualizar_pacientes);

        menuReportePacientes.setText("Reporte pacientes");
        menuReportePacientes.setEnabled(false);
        menuReportePacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportePacientesActionPerformed(evt);
            }
        });
        jMenu1.add(menuReportePacientes);

        MenuRealizarConsulta.add(jMenu1);

        jMenu6.setText("Doctores");

        menu_agregar_doctores.setText("Agregar Doctores");
        menu_agregar_doctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_agregar_doctoresActionPerformed(evt);
            }
        });
        jMenu6.add(menu_agregar_doctores);

        menu_mostrar_doctores.setText("Mostrar Doctores");
        menu_mostrar_doctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_mostrar_doctoresActionPerformed(evt);
            }
        });
        jMenu6.add(menu_mostrar_doctores);

        reporteDoctores.setText("Reporte Doctores");
        reporteDoctores.setEnabled(false);
        reporteDoctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteDoctoresActionPerformed(evt);
            }
        });
        jMenu6.add(reporteDoctores);

        MenuRealizarConsulta.add(jMenu6);

        jMenu3.setText("Citas");

        menu_agregar_cita.setText("Agregar Cita");
        menu_agregar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_agregar_citaActionPerformed(evt);
            }
        });
        jMenu3.add(menu_agregar_cita);

        MenuRealizarConsulta.add(jMenu3);

        jMenu5.setText("Ayuda");

        MenuAcercade.setText("Acerca de");
        MenuAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAcercadeActionPerformed(evt);
            }
        });
        jMenu5.add(MenuAcercade);

        MenuAyuda.setText("Ayuda");
        MenuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAyudaActionPerformed(evt);
            }
        });
        jMenu5.add(MenuAyuda);

        MenuRealizarConsulta.add(jMenu5);

        setJMenuBar(MenuRealizarConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
            .addComponent(Pane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPacientesActionPerformed
        if(AgrePac==null || AgrePac.isClosed())
        { 
            try {
               // TODO add your handling code here:
               AgrePac = new AgregarPacientes();
           } catch (SQLException ex) {
               Logger.getLogger(Padre.class.getName()).log(Level.SEVERE, null, ex);
           }
               Pane1.add(AgrePac);
               AgrePac.show();
        }
    }//GEN-LAST:event_AgregarPacientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    if(mosPac1==null || mosPac1.isClosed())
        {    
        try {
                // TODO add your handling code here:
                mosPac1=new MostrarPacientes1();
            } catch (SQLException ex) {
                Logger.getLogger(Padre.class.getName()).log(Level.SEVERE, null, ex);
            }
                       Pane1.add(mosPac1);
                       mosPac1.show();

        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
     //   int x= JOptionPane.showConfirmDialog(rootPane, "Desea salir ?", "Pregunta", JOptionPane.YES_NO_OPTION);
     /*   
        if(x==1)
        {
       this.formWindowClosing(evt);
        }
       */ 
        
    }//GEN-LAST:event_formWindowClosing

    private void menu_agregar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_agregar_citaActionPerformed
         if(agreCita==null || agreCita.isClosed())
        {    
       
                agreCita=new AgregarCita();
                Pane1.add(agreCita);
                agreCita.show();
             
                       

        }
               
    }//GEN-LAST:event_menu_agregar_citaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         try {
        // TODO add your handling code here:
        mosPac2=new MostrarPacientes2();
    } catch (SQLException ex) {
        Logger.getLogger(Padre.class.getName()).log(Level.SEVERE, null, ex);
    }
                   Pane1.add(mosPac2);
               mosPac2.show();

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnAddPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPacienteActionPerformed
        // TODO add your handling code here:
         if(AgrePac==null || AgrePac.isClosed())
        { 
            try {
               // TODO add your handling code here:
               AgrePac = new AgregarPacientes();
           } catch (SQLException ex) {
               Logger.getLogger(Padre.class.getName()).log(Level.SEVERE, null, ex);
           }
               Pane1.add(AgrePac);
               AgrePac.show();
        }
    }//GEN-LAST:event_btnAddPacienteActionPerformed

    private void BtnMostrarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarPacientesActionPerformed
        // TODO add your handling code here:
         try {
        // TODO add your handling code here:
        mosPac2=new MostrarPacientes2();
    } catch (SQLException ex) {
        Logger.getLogger(Padre.class.getName()).log(Level.SEVERE, null, ex);
    }
                   Pane1.add(mosPac2);
               mosPac2.show();
    }//GEN-LAST:event_BtnMostrarPacientesActionPerformed

    private void BtnAddPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddPacienteActionPerformed
        // TODO add your handling code here:
 if(AgrePac==null || AgrePac.isClosed())
        { 
            try {
               // TODO add your handling code here:
               AgrePac = new AgregarPacientes();
           } catch (SQLException ex) {
               Logger.getLogger(Padre.class.getName()).log(Level.SEVERE, null, ex);
           }
               Pane1.add(AgrePac);
               AgrePac.show();
        }
    }//GEN-LAST:event_BtnAddPacienteActionPerformed

    private void MenuAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAcercadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuAcercadeActionPerformed

    private void MenuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAyudaActionPerformed
        // TODO add your handling code here:
        try {
  //   File path = new File ("C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\EjemConexionBDmysql\\dist\\EjemploAyuda.pdf");
  System.out.println (new File ("").getAbsolutePath ()); // Indica el path donde se ejecuta
  String pathActual;
  String rutaGenerada;
  pathActual=new File ("").getAbsolutePath ();
  rutaGenerada=pathActual+"\\ejemplo.chm";
  System.out.println ("la ruta completa fue: "+rutaGenerada);
  File path = new File (rutaGenerada);   
  Desktop.getDesktop().open(path);
}catch (IOException ex) {
     ex.printStackTrace();
}
        
       // File f = new File("test/.././file.txt");
      //  System.out.println(f.getPath());
        
    }//GEN-LAST:event_MenuAyudaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
  //   File path = new File ("C:\\Users\\Alvaro\\Documents\\NetBeansProjects\\EjemConexionBDmysql\\dist\\EjemploAyuda.pdf");
//  System.out.println (new File ("").getAbsolutePath ()); // Indica el path donde se ejecuta
  String pathActual;
  String rutaGenerada;
  pathActual=new File ("").getAbsolutePath ();
  rutaGenerada=pathActual+"\\ejemplo.chm";

  File xy = new File (rutaGenerada);   
  Desktop.getDesktop().open(xy);
}catch (IOException ex) {
     ex.printStackTrace();
}        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reporteDoctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteDoctoresActionPerformed
        // TODO add your handling code here:
       
    
    
        
    }//GEN-LAST:event_reporteDoctoresActionPerformed

    private void menuReportePacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportePacientesActionPerformed
       
           
    }//GEN-LAST:event_menuReportePacientesActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         if(AgrePacProce==null || AgrePacProce.isClosed())
        { 
            try {
               // TODO add your handling code here:
               AgrePacProce = new AgregarPacientesProced();
           } catch (SQLException ex) {
               Logger.getLogger(Padre.class.getName()).log(Level.SEVERE, null, ex);
           }
               Pane1.add(AgrePacProce);
               AgrePacProce.show();
        }
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void menu_agregar_doctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_agregar_doctoresActionPerformed
        // TODO add your handling code here:
          if(AgreDocProce==null || AgreDocProce.isClosed())
        { 
            try {
               // TODO add your handling code here:
               AgreDocProce = new AgregarDoctoresProced();
           } catch (SQLException ex) {
               Logger.getLogger(Padre.class.getName()).log(Level.SEVERE, null, ex);
           }
               Pane1.add(AgreDocProce);
               AgreDocProce.show();
        }
    }//GEN-LAST:event_menu_agregar_doctoresActionPerformed

    private void menu_mostrar_doctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_mostrar_doctoresActionPerformed
         // TODO add your handling code here:
         // MostrarDoctores mosDoc
         if(mosDoc==null || mosDoc.isClosed())
        { 
            try {
               // TODO add your handling code here:
               mosDoc = new MostrarDoctores();
           } catch (SQLException ex) {
               Logger.getLogger(Padre.class.getName()).log(Level.SEVERE, null, ex);
           }
               Pane1.add(mosDoc);
               mosDoc.show();
        }
    }//GEN-LAST:event_menu_mostrar_doctoresActionPerformed

    private void menu_actualizar_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_actualizar_pacientesActionPerformed
        // TODO add your handling code here:
        if(actuPac==null || actuPac.isClosed())
        { 
            try {
               // TODO add your handling code here:
               actuPac = new ActualizarPacientes();
           } catch (SQLException ex) {
               Logger.getLogger(Padre.class.getName()).log(Level.SEVERE, null, ex);
           }
               Pane1.add(actuPac);
               actuPac.show();
        }
    }//GEN-LAST:event_menu_actualizar_pacientesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Padre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Padre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Padre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Padre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Padre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarPacientes;
    private javax.swing.JButton BtnAddPaciente;
    private javax.swing.JButton BtnMostrarPacientes;
    private javax.swing.JMenuItem MenuAcercade;
    private javax.swing.JMenuItem MenuAyuda;
    private javax.swing.JMenuBar MenuRealizarConsulta;
    private javax.swing.JDesktopPane Pane1;
    private javax.swing.JButton btnAddPaciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuReportePacientes;
    private javax.swing.JMenuItem menu_actualizar_pacientes;
    private javax.swing.JMenuItem menu_agregar_cita;
    private javax.swing.JMenuItem menu_agregar_doctores;
    private javax.swing.JMenuItem menu_mostrar_doctores;
    private javax.swing.JMenuItem reporteDoctores;
    // End of variables declaration//GEN-END:variables
}
