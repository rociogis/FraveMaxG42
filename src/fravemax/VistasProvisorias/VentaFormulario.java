
package fravemax.VistasProvisorias;

import fravemax.AccesoADatos.ClienteData;
import fravemax.AccesoADatos.VentaData;
import fravemax.Entidades.Cliente;
import fravemax.Entidades.Venta;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class VentaFormulario extends javax.swing.JInternalFrame {
    ClienteData clData = new ClienteData();
    VentaData veData = new VentaData();
    Venta venta;
    Cliente cliente;
  
    public VentaFormulario() {
        initComponents();
        cargarComboBox();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdcSeleccionFecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jrbFechaActual = new javax.swing.JRadioButton();
        jcbClientesRegistrados = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jlFechaActual = new javax.swing.JLabel();
        jbRegistrarVenta = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVentasDe1Cliente = new javax.swing.JTable();
        jbLimpiarYResetear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jlFormato = new javax.swing.JLabel();

        jdcSeleccionFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdcSeleccionFechaMouseClicked(evt);
            }
        });

        jLabel1.setText("Fecha del dia de la Venta.");

        jrbFechaActual.setText("Utilizar fecha actual.");
        jrbFechaActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbFechaActualMouseClicked(evt);
            }
        });

        jcbClientesRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClientesRegistradosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Formulario Venta");

        jbRegistrarVenta.setText("Registrar Venta");
        jbRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarVentaActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtVentasDe1Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtVentasDe1Cliente);

        jbLimpiarYResetear.setText("Limpiar Campos y Botones");

        jLabel4.setText("Clientes Registrados.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbLimpiarYResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jrbFechaActual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jlFormato, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdcSeleccionFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbClientesRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdcSeleccionFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFormato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFechaActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbFechaActual, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbClientesRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbRegistrarVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbLimpiarYResetear))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        clData = null;
        veData = null;
        cliente = null;
        venta = null;
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jdcSeleccionFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdcSeleccionFechaMouseClicked
        jdcSeleccionFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }//GEN-LAST:event_jdcSeleccionFechaMouseClicked

    private void jrbFechaActualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbFechaActualMouseClicked
        if(jrbFechaActual.isSelected()){
            jdcSeleccionFecha.setEnabled(false); 
            jlFormato.setText("aaaa-mm-dd");
            jlFechaActual.setText(LocalDate.now(ZoneId.systemDefault())+"");
        }else{
            jdcSeleccionFecha.setEnabled(true);
            jlFechaActual.setText("");
            jlFormato.setText("");
        }
    }//GEN-LAST:event_jrbFechaActualMouseClicked

    private void jcbClientesRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClientesRegistradosActionPerformed
        //Obtencion del objeto Cliente.
        cliente = jcbClientesRegistrados.getItemAt(jcbClientesRegistrados.getSelectedIndex());
    }//GEN-LAST:event_jcbClientesRegistradosActionPerformed

    private void jbRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarVentaActionPerformed
        //Creacion del objeto Venta.
        venta = new Venta();
        venta.setCliente(cliente);
        if(jrbFechaActual.isSelected()){
            venta.setFechaVenta(LocalDate.now(ZoneId.systemDefault()));
        }else{
            venta.setFechaVenta(jdcSeleccionFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        }
        veData.registraVenta(venta);
    }//GEN-LAST:event_jbRegistrarVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimpiarYResetear;
    private javax.swing.JButton jbRegistrarVenta;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Cliente> jcbClientesRegistrados;
    private com.toedter.calendar.JDateChooser jdcSeleccionFecha;
    private javax.swing.JLabel jlFechaActual;
    private javax.swing.JLabel jlFormato;
    private javax.swing.JRadioButton jrbFechaActual;
    private javax.swing.JTable jtVentasDe1Cliente;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBox(){
        ArrayList<Cliente> clientes;
        clientes = (ArrayList)clData.listarClientes();
        
      for(Cliente aux : clientes){
          jcbClientesRegistrados.addItem(aux);
      }
      return;
    }





}
