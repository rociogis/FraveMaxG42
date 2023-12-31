/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax.Vistas;

import fravemax.AccesoADatos.ClienteData;
import fravemax.AccesoADatos.Conexion;
import fravemax.AccesoADatos.ProductoData;
import fravemax.AccesoADatos.VentaData;
import fravemax.Entidades.Cliente;
import fravemax.Entidades.Producto;
import fravemax.Entidades.Venta;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDate;

/**
 *
 * @author Bruno
 */
public class DetallesVenta extends javax.swing.JInternalFrame {
    ClienteData clData = new ClienteData();
    VentaData veData = new VentaData();
    Venta venta;
    Cliente cliente;
    double neto = 0;
    double aux = 0;
    private Connection con=Conexion.getConexion();
    
    private DefaultTableModel modelo1=new DefaultTableModel(){
    
        public boolean isCellEditable(int f,int c){
        return false;
        }
    };
    
    private DefaultTableModel modelo2=new DefaultTableModel(){
    
        public boolean isCellEditable(int f,int c){
        return false;
        }
    };

    /**
     * Creates new form DetallesVenta
     */
    public DetallesVenta() {
        initComponents();
        armarCabeceraProductos();
        armarCabeceraCargaProductos();
        limpiarCamposYBotones();
        cargarComboBox();

//        JOptionPane.showMessageDialog(DetallesVenta.this, "Debe elegir una venta");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jsCantidad = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jbEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNeto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCargaProductos = new javax.swing.JTable();
        txtIva = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jcbVentas = new javax.swing.JComboBox<>()

        ;
        jLabel2 = new javax.swing.JLabel();
        txtBuscarProducto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jrbTarjeta = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jrbContado = new javax.swing.JRadioButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setText("DETALLE DE VENTA");

        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fravemax/Imagicon/Aceptar.png"))); // NOI18N
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtProductos);

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel6.setText("Cantidad");

        jsCantidad.setModel(new SpinnerNumberModel(1, 1, null, 1));

        jPanel1.setBackground(new java.awt.Color(200, 167, 175));

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel3.setText("Total ");

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(240, 230, 202));
        txtTotal.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fravemax/Imagicon/Eliminar.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel9.setText("Fecha ");

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel10.setText("Cliente");

        txtFecha.setBackground(new java.awt.Color(255, 213, 237));

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel5.setText("Neto");

        txtCliente.setBackground(new java.awt.Color(255, 213, 237));

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jLabel7.setText("IVA 21%");

        txtNeto.setEditable(false);
        txtNeto.setBackground(new java.awt.Color(240, 230, 202));
        txtNeto.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jtCargaProductos.setBackground(new java.awt.Color(255, 245, 185));
        jtCargaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jtCargaProductos.setGridColor(new java.awt.Color(228, 191, 9));
        jtCargaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCargaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtCargaProductos);

        txtIva.setEditable(false);
        txtIva.setBackground(new java.awt.Color(240, 230, 202));
        txtIva.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtIva.setText("  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNeto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(240, 190, 172));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel4.setText("Seleccione Venta");

        jcbVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbVentasMouseClicked(evt);
            }
        });
        jcbVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVentasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel2.setText("Buscar Productos");

        txtBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarProductoActionPerformed(evt);
            }
        });
        txtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarProductoKeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(216, 182, 97));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jrbTarjeta.setBackground(new java.awt.Color(216, 182, 97));
        jrbTarjeta.setText("Tarjeta");
        jrbTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTarjetaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel8.setText("Condicion Venta");

        jrbContado.setBackground(new java.awt.Color(216, 182, 97));
        jrbContado.setText("Contado");
        jrbContado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbContadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbContado)
                        .addGap(18, 18, 18)
                        .addComponent(jrbTarjeta)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbTarjeta)
                    .addComponent(jrbContado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jsCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jsCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jbAgregar)))
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarProductoKeyReleased
        borrarFilas1();
        cargaDatosProductos();
    }//GEN-LAST:event_txtBuscarProductoKeyReleased

    private void txtBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProductoActionPerformed
//         TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProductoActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:
        cargaDetalleVenta();
        jbAgregar.setEnabled(false);
       jrbContado.setEnabled(false);
       jrbTarjeta.setEnabled(false);
       jtProductos.clearSelection();
       
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jrbTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTarjetaActionPerformed
        // TODO add your handling code here:
        jrbContado.setSelected(false);
        txtBuscarProducto.setEnabled(true);
    }//GEN-LAST:event_jrbTarjetaActionPerformed

    private void jcbVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVentasActionPerformed
        // TODO add your handling code here:


        ArrayList<Venta> ventas;
        ventas = (ArrayList)veData.listarTodasLasVentas();
        String ventaSelec = (String) jcbVentas.getSelectedItem();

        Venta ventaSeleccionada = null;
        for (Venta venta : ventas) {
            if (venta.toString().equals(ventaSelec)) {
                ventaSeleccionada = venta;
                break;
            }
        }
        
        String nombreCliente =ventaSeleccionada.getCliente().getApellido();
        String apellidoCliente = ventaSeleccionada.getCliente().getNombre();
        LocalDate fechaVenta = ventaSeleccionada.getFechaVenta();
        String fechaVta = fechaVenta.toString();

        txtFecha.setText(fechaVta);
        txtCliente.setText(apellidoCliente.toUpperCase()+" "+nombreCliente.toUpperCase());
    
    }//GEN-LAST:event_jcbVentasActionPerformed

    private void jtProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtProductosMouseClicked
        // TODO add your handling code here:
        jbAgregar.setEnabled(true);
    }//GEN-LAST:event_jtProductosMouseClicked

    private void jrbContadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbContadoActionPerformed
        // TODO add your handling code here:
        jrbTarjeta.setSelected(false);
      txtBuscarProducto.setEnabled(true);
    }//GEN-LAST:event_jrbContadoActionPerformed

    private void jtCargaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCargaProductosMouseClicked
        // TODO add your handling code here:
        jbEliminar.setEnabled(true);
    }//GEN-LAST:event_jtCargaProductosMouseClicked

    private void jcbVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbVentasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbVentasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JComboBox<String> jcbVentas;
    private javax.swing.JRadioButton jrbContado;
    private javax.swing.JRadioButton jrbTarjeta;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JTable jtCargaProductos;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtNeto;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

private void armarCabeceraProductos(){
modelo1.addColumn("Producto");
modelo1.addColumn("Stock");
modelo1.addColumn("$ Lista");
modelo1.addColumn("$ Contado");
jtProductos.setModel(modelo1);
}

private void armarCabeceraCargaProductos(){

modelo2.addColumn("Producto");
modelo2.addColumn("Cantidad");
modelo2.addColumn("$ Unitario");
modelo2.addColumn("Subtotal");
    jtCargaProductos.setModel(modelo2);
}

private void borrarFilas1(){
int f=jtProductos.getRowCount()-1;
for(;f>=0;f--){
modelo1.removeRow(f);
}
}

private void borrarFilas2(){
int f=jtProductos.getRowCount()-1;
for(;f>=0;f--){
modelo2.removeRow(f);
}
}

private void limpiarCamposYBotones(){
        txtBuscarProducto.setText("");
        txtBuscarProducto.setEnabled(false);
        jbAgregar.setEnabled(false);
        jbEliminar.setEnabled(false);
        borrarFilas1();
        borrarFilas2();
        jrbContado.setSelected(false);
        jrbTarjeta.setSelected(false);
    }

private void cargarComboBox(){
        ArrayList<Venta> ventas;
        ventas = (ArrayList)veData.listarTodasLasVentas();
        
      for(Venta aux : ventas){
          jcbVentas.addItem(aux.toString());
      }
    }

    private void cargaDatosProductos() {

        String nombreProd = txtBuscarProducto.getText();
        if (!nombreProd.isEmpty()) {
            ProductoData prodElegido = new ProductoData();
            List<Producto> productos = prodElegido.buscarProductoXNombre(nombreProd);

            for (Producto producto : productos) {
                modelo1.addRow(new Object[]{producto.getNombreProducto(), producto.getStock(), producto.getPrecioActual(), (producto.getPrecioActual() * 0.9)});
            }
        }

    }
    
    private void cargaDetalleVenta(){
        int prodElegido = jtProductos.getSelectedRow();
        int cantidad = (int) jsCantidad.getValue();
        double precio = 0;
        double precioUnit = 0;
        
        if(jrbContado.isSelected()){
        precio = (double) modelo1.getValueAt(prodElegido, 3);
        } else {
        precio = (double) modelo1.getValueAt(prodElegido, 2);
        }
        
        double iva = 0;
        double total = 0;
        double precioTotal = precio * cantidad;
        
    modelo2.addRow(new Object[]{modelo1.getValueAt(prodElegido, 0), jsCantidad.getValue(),  precio, precioTotal});

        neto = aux + (precioTotal / 1.21);
        iva = neto * 0.21;
        total = (iva + neto);
         aux= neto;

        DecimalFormat formato = new DecimalFormat("#,###.##"); // Define el formato con dos decimales
        String netoFormat = formato.format(neto);
        String ivaFormat = formato.format(iva);
        String totalFormat = formato.format(total);

        txtNeto.setText(netoFormat);
        txtIva.setText(ivaFormat);
        txtTotal.setText(totalFormat);
    }
        

    
}
