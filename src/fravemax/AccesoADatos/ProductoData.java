/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax.AccesoADatos;

import fravemax.Entidades.Producto;
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
public class ProductoData {
     private Connection con = null;   
  public ProductoData(){
  con = Conexion.getConexion();
  }
public void registrarProducto(Producto producto){
 String sql = "INSERT INTO producto(nombreProducto,descripcion,precioActual,stock,estado)"
         + "VALUES (?,?,?,?,?)";
 try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,producto.getNombreProducto());
            ps.setString(2,producto.getDescripcion());
            ps.setDouble(3,producto.getPrecioActual());
            ps.setInt(4,producto.getStock());
            ps.setBoolean(5,producto.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
               producto.setIdProducto(rs.getInt(1));
                 JOptionPane.showMessageDialog(null,"PRODUCTO AGRAGADO" + producto.toString());
            }
} catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Acceder a la tabla");
}

}
public void eliminarProducto(int idProducto){
 String sql = "UPDATE Producto SET Estado = 0 WHERE Producto.idProducto = ?;";
 try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto");
        }
}
public void modificarProducto(Producto producto){
        String sql="update producto set nombreProducto=?,descripcion=?,precioActual=?,stock=?,estado=? "
                + "where idProducto=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,producto.getNombreProducto());
            ps.setString(2,producto.getDescripcion());
            ps.setDouble(3,producto.getPrecioActual());
            ps.setInt(4,producto.getStock());
            ps.setBoolean(5,producto.isEstado());
            ps.setInt(6,producto.getIdProducto());
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Producto Modificado");
            }
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Cliente");
        }
        
    }

}



