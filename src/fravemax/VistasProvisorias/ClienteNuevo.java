
package fravemax.VistasProvisorias;

import fravemax.AccesoADatos.ClienteData;
import fravemax.Entidades.Cliente;
import javax.swing.JOptionPane;


public class ClienteNuevo extends javax.swing.JInternalFrame {
    Cliente cl;

    public ClienteNuevo() {
        initComponents();
        limpiarCamposYBotones();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbSalir = new javax.swing.JButton();
        jbGuardarNuevoCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfDniCliente = new javax.swing.JTextField();
        jtfApellidoCliente = new javax.swing.JTextField();
        jtfNombreCliente = new javax.swing.JTextField();
        jtfTelefonoCliente = new javax.swing.JTextField();
        jtfDireccionCliente = new javax.swing.JTextField();
        jbEliminarCliente = new javax.swing.JButton();
        jbModificarCliente = new javax.swing.JButton();
        jbBuscarCliente = new javax.swing.JButton();
        jbLimpiarCampos = new javax.swing.JButton();

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbGuardarNuevoCliente.setText("Guardar");
        jbGuardarNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarNuevoClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI");

        jLabel2.setText("Apellido");

        jLabel3.setText("Nombre");

        jLabel4.setText("Telefono");

        jLabel5.setText("Direccion");

        jbEliminarCliente.setText("Eliminar");

        jbModificarCliente.setText("Modificar");

        jbBuscarCliente.setText("Buscar");
        jbBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarClienteActionPerformed(evt);
            }
        });

        jbLimpiarCampos.setText("Limpiar");
        jbLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfDniCliente)
                            .addComponent(jtfApellidoCliente)
                            .addComponent(jtfNombreCliente)
                            .addComponent(jtfTelefonoCliente)
                            .addComponent(jtfDireccionCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbBuscarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbLimpiarCampos)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbEliminarCliente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbGuardarNuevoCliente)
                            .addComponent(jbSalir))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarNuevoCliente)
                    .addComponent(jbEliminarCliente)
                    .addComponent(jbModificarCliente)
                    .addComponent(jbBuscarCliente))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbLimpiarCampos)
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarCamposActionPerformed
        limpiarCamposYBotones();
    }//GEN-LAST:event_jbLimpiarCamposActionPerformed

    private void jbBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarClienteActionPerformed
        
        
        
        
        jbModificarCliente.setEnabled(true);//Solo se permite modificar luego de buscar.
        jbEliminarCliente.setEnabled(true);//Solo se permite eliminar luego de buscar.
    }//GEN-LAST:event_jbBuscarClienteActionPerformed

    private void jbGuardarNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarNuevoClienteActionPerformed
        //Verificacion de campos.
        if(excedeLongitudMax((jtfDniCliente.getText()+""), 11)||excedeLongitudMax(jtfApellidoCliente.getText(), 60)||
                excedeLongitudMax(jtfNombreCliente.getText(), 60)||excedeLongitudMax(jtfDireccionCliente.getText(), 100)||
                    excedeLongitudMax(jtfTelefonoCliente.getText(), 20)){
            JOptionPane.showMessageDialog(this, "...mmm, alguno de los campos excede la longitud permitida.");
            return;//en jtfDniCliente hay un comportamiento inesperado en Java si se superan los 10 digitos.
        }           // conviene usar Long.parseLong() en lugar de Integer.parseInt()
        if(verificarCamposVacios()){
            JOptionPane.showMessageDialog(this, "...mmm, ha dejado algun campo vacio.");
            return;
        }
        if(verificarSiHayNumeros(jtfApellidoCliente.getText())||verificarSiHayNumeros(jtfNombreCliente.getText())){
            JOptionPane.showMessageDialog(this, "...mmm, parece que hay numeros, donde no deberia.");
            return;
        }
        if(verificarSiHayLetras(jtfDniCliente.getText())||verificarSiHayLetras(jtfTelefonoCliente.getText())){
            JOptionPane.showMessageDialog(this, "...mmm, parece que hay letras, donde no deberia.");
            return;
        }
        //Instanciar Cliente Nuevo.
        cl = instanciarDesdeCampos();
        //Instanciar clase de servicio.
        ClienteData clData = new ClienteData();
        //Envio de datos a BD.
        clData.agregarCliente(cl);
        
    }//GEN-LAST:event_jbGuardarNuevoClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbBuscarCliente;
    private javax.swing.JButton jbEliminarCliente;
    private javax.swing.JButton jbGuardarNuevoCliente;
    private javax.swing.JButton jbLimpiarCampos;
    private javax.swing.JButton jbModificarCliente;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtfApellidoCliente;
    private javax.swing.JTextField jtfDireccionCliente;
    private javax.swing.JTextField jtfDniCliente;
    private javax.swing.JTextField jtfNombreCliente;
    private javax.swing.JTextField jtfTelefonoCliente;
    // End of variables declaration//GEN-END:variables
    
    private void limpiarCamposYBotones(){
        jbBuscarCliente.setEnabled(true);
        jbEliminarCliente.setEnabled(false);
        jbGuardarNuevoCliente.setEnabled(true);
        jbModificarCliente.setEnabled(false);
        jtfApellidoCliente.setText("");
        jtfNombreCliente.setText("");
        jtfDireccionCliente.setText("");
        jtfDniCliente.setText("");
        jtfTelefonoCliente.setText("");
    }
    private boolean verificarCamposVacios(){
        return (jtfApellidoCliente.getText().equals("") || jtfNombreCliente.getText().equals("") ||
                    jtfDniCliente.getText().equals("") || jtfDireccionCliente.getText().equals("") ||
                        jtfTelefonoCliente.getText().equals(""));     
    }
    private boolean verificarSiHayNumeros(String cadena){//Esta funcion busca si hay un numero en un String que se supone no debe tener numeros.
        for(int i=0; i<cadena.length(); i++){
        try{
            Integer.parseInt(cadena.charAt(i)+"");
            return true;
        }catch(NumberFormatException nfE){
            }
        }
        return false; 
    }
    private boolean verificarSiHayLetras(String cadena){
        try{
            int num = Integer.parseInt(cadena);
        }catch(NumberFormatException nfE){
            return true;
        }
        return false;
    }
    private boolean excedeLongitudMax(String cadena, int dimMax){
        return cadena.length()>dimMax;
    }
    private Cliente instanciarDesdeCampos(){
        Cliente cl = new Cliente();
        cl.setDni(Integer.parseInt(jtfDniCliente.getText()));
        cl.setApellido(jtfApellidoCliente.getText().toLowerCase());
        cl.setNombre(jtfNombreCliente.getText().toLowerCase());
        cl.setDomicilio(jtfDireccionCliente.getText().toLowerCase());
        cl.setTelefono(jtfTelefonoCliente.getText().toLowerCase());     
        return cl;
    }
}
