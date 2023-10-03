/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax.AccesoADatos;

import fravemax.Entidades.Cliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 54351
 */
public class ClienteData {
    private Connection con=null;
    
    public ClienteData(){
        con=Conexion.getConexion();
    }
    
    public void agregarCliente(Cliente cliente){
        String sql="insert into cliente(dni,apellido,nombre,domicilio,telefono)"
                + "values(?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,cliente.getDni());
            ps.setString(2,cliente.getApellido());
            ps.setString(3,cliente.getNombre());
            ps.setString(4,cliente.getDomicilio());
            ps.setString(5,cliente.getTelefono());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                cliente.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Cliente agregado "+cliente.getIdCliente());
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla cliente");
        }
    }
    
    public void modificarCliente(Cliente cliente){
        String sql="update cliente set apellido=?,nombre=?,domicilio=?,telefono=? "
                + "where idCliente=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,cliente.getApellido());
            ps.setString(2,cliente.getNombre());
            ps.setString(3,cliente.getDomicilio());
            ps.setString(4,cliente.getTelefono());
            ps.setInt(5,cliente.getIdCliente());
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Cliente Modificado");
            }
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Cliente");
        }
        
    }
    
    public void eliminarCliente(int idCliente) {
        String sql = "DELETE Cliente, Venta, DetalleVenta\n"
                + "FROM Cliente\n"
                + "LEFT JOIN Venta ON Cliente.idCliente = Venta.idCliente\n"
                + "LEFT JOIN DetalleVenta ON Venta.idVenta = DetalleVenta.idVenta\n"
                + "WHERE Cliente.idCliente = 1;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cliente Eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente");
        }
    }

    
    
}
