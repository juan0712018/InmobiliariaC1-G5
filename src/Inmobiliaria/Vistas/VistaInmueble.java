/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmobiliaria.Vistas;


import Inmobiliaria.Modelo.Conexion;
import Inmobiliaria.Modelo.Inmueble;
import Inmobiliaria.Modelo.InmuebleData;
import Inmobiliaria.Modelo.Persona;
import Inmobiliaria.Modelo.PersonaData;
import static java.lang.Double.parseDouble;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author tobia
 */
public final class VistaInmueble extends javax.swing.JFrame{

  private InmuebleData inmuebleData;
  private Conexion conexion;

  
    public VistaInmueble() {
        initComponents();
        limpiar ();
        Bloquear  ();
        this.setLocationRelativeTo(null);
        this.setTitle("Cargar Inmueble");
        conexion = new Conexion();
        inmuebleData = new InmuebleData(conexion);
       
    }
     void limpiar (){
         jTid.setText("");
         jTdireccion.setText("");
         jTCantDeAmbientes.setText("");
         jTprecio.setText("");
         chdisponible.setSelected(false);
jTdueño.setText("");     }
     void Bloquear  (){
         jTdireccion.setEnabled(false);
         jTCantDeAmbientes.setEnabled(false);
         jTprecio.setEnabled(false);
         chdisponible.setEnabled(false); 
         jBnuevo.setEnabled(true);
         jBguardar.setEnabled(false);
         jBactualizar.setEnabled(false);}
     void desbloquear(){
         jTdireccion.setEnabled(true);
         jTCantDeAmbientes.setEnabled(true);
         jTprecio.setEnabled(true);
         chdisponible.setEnabled(true);
         jBnuevo.setEnabled(false);
         jBguardar.setEnabled(true);
         jBactualizar.setEnabled(true);
     }
         
                                              

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLdireccion = new javax.swing.JLabel();
        jLCDambientes = new javax.swing.JLabel();
        jLprecio = new javax.swing.JLabel();
        jLdisponible = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTid = new javax.swing.JTextField();
        jTCantDeAmbientes = new javax.swing.JTextField();
        jTprecio = new javax.swing.JTextField();
        chdisponible = new javax.swing.JCheckBox();
        jLinmueble = new javax.swing.JLabel();
        jTdireccion = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jBguardar = new javax.swing.JButton();
        jBactualizar = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTdueño = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLdireccion.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLdireccion.setText("direccion");

        jLCDambientes.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLCDambientes.setText("cantidad de ambientes");

        jLprecio.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLprecio.setText("precio");

        jLdisponible.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLdisponible.setText("disponible");

        jLabel6.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N

        jTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidActionPerformed(evt);
            }
        });

        jTCantDeAmbientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCantDeAmbientesActionPerformed(evt);
            }
        });

        chdisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chdisponibleActionPerformed(evt);
            }
        });

        jLinmueble.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        jLinmueble.setText("N° de inmueble");

        jTdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdireccionActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jBguardar.setText("guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBactualizar.setText("actualizar");
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });

        jBnuevo.setText("nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBlimpiar.setText("limpiar");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jBsalir.setText("salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jBnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBactualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBlimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBguardar)
                    .addComponent(jBactualizar)
                    .addComponent(jBlimpiar)
                    .addComponent(jBsalir))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jBborrar.setText("borrar");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });

        jBbuscar.setText("buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Id_Dueño");

        jTdueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdueñoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLinmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jBborrar)
                .addGap(133, 133, 133))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLCDambientes, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTCantDeAmbientes, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBbuscar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLdisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chdisponible)
                                    .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTdueño, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLinmueble, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBborrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLdireccion)
                    .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLCDambientes)
                    .addComponent(jTCantDeAmbientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLprecio)
                    .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLdisponible)
                    .addComponent(chdisponible))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTdueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Registro Inmueble");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCantDeAmbientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCantDeAmbientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCantDeAmbientesActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
      if(jTid != null){
          String direc = jTdireccion.getText();
          int ambiente = Integer.parseInt(jTCantDeAmbientes.getText());
          Double precio = parseDouble(jTprecio.getText());
          Boolean dispo = chdisponible.isSelected();
          
          Inmueble inmueble2 = new Inmueble(direc, ambiente, precio, dispo);
          inmuebleData.actualizarInmueble(inmueble2);
          
      }
       
         
                                            

    }//GEN-LAST:event_jBactualizarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
   InmuebleData inmuebledata;
            inmuebledata = new InmuebleData(conexion);
            Persona p = null;
            PersonaData pd= new PersonaData(conexion); 
            
        String direc = jTdireccion.getText();
            int cantDamb = Integer.parseInt(jTCantDeAmbientes.getText());
            double precio = Float.valueOf(jTprecio.getText());
            boolean disponible=chdisponible.isSelected();
            int iddueño= Integer.parseInt(jTdueño.getText());
       
          
            p= pd.obtenerPersona(iddueño);
     Inmueble inmueble = new Inmueble(precio, direc, cantDamb, disponible, p);
            inmuebleData.guardarInmueble(inmueble);
            jTid.setText(inmueble.getId_inmueble()+"");
            limpiar(); 
     
       
             // TODO add your handling code here:
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jTdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdireccionActionPerformed

    private void jTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
desbloquear();        // TODO add your handling code here:
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
int id = Integer.parseInt(jTid.getText());
         
         inmuebleData.borrarInmueble(id);
          
         limpiar();   
         // TODO add your handling code here:
    }//GEN-LAST:event_jBborrarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
       limpiar();
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
 int cantDamb = Integer.parseInt(jTCantDeAmbientes.getText());
            double costo = Float.valueOf(jTprecio.getText());
            
         Inmueble inmueble2 = inmuebleData.buscarInmueble(costo,cantDamb );
        if(inmueble2 != null){
            jTid.setText(inmueble2.getId_inmueble()+"");
            jTdireccion.setText(inmueble2.getDireccion());
            jTCantDeAmbientes.setText(inmueble2.getCantidad_de_ambientes()+"");
            jTprecio.setText(inmueble2.getPrecio()+"");
            chdisponible.setSelected(inmueble2.getDisponible());
            jTdueño.setText(inmueble2.getPersona()+"");
           
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTdueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdueñoActionPerformed

    private void chdisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chdisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chdisponibleActionPerformed

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
            java.util.logging.Logger.getLogger(VistaInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInmueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInmueble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chdisponible;
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBborrar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLCDambientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLdireccion;
    private javax.swing.JLabel jLdisponible;
    private javax.swing.JLabel jLinmueble;
    private javax.swing.JLabel jLprecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTCantDeAmbientes;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTdueño;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTprecio;
    // End of variables declaration//GEN-END:variables
}
