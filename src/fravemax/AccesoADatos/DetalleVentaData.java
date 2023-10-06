/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax.AccesoADatos;
//
//import fravemax.Entidades.Producto;
//import fravemax.Entidades.DetalleVenta;
//import fravemax.Entidades.Venta;
//import java.awt.List;
//import java.sql.Date;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import javax.swing.JOptionPane;
import fravemax.Entidades.DetalleVenta;
import fravemax.Entidades.Producto;
import fravemax.Entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author 54351
 */
public class DetalleVentaData {
    private Connection con = null;   
  public DetalleVentaData(){
  con = Conexion.getConexion();
  }
  
  
  
  public void cargarDetalleVenta(DetalleVenta Dventa){
 String sql = "INSERT INTO Detalleventa(cantidad, idVenta, precioVenta, idProducto)"
         + "VALUES (?,?,?,?)";
 try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,Dventa.getCantidad());
            ps.setInt(2,Dventa.getVenta().getIdVenta());
            ps.setDouble(3,Dventa.getPrecioVenta());
            ps.setInt(4,Dventa.getProducto().getIdProducto());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            Dventa.setIdDetalleVenta(rs.getInt(1));
                 JOptionPane.showMessageDialog(null,"DETALLE VENTA AGREGADO" + Dventa.toString());
            }
} catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Acceder a la tabla");
}
}
public void eliminarDetalleVenta(int idDetalleVenta){
 String sql = "DELETE FROM detalleventa WHERE detalleventa.idDetalleVenta = ?;";
 
 try {
            PreparedStatement ps = con.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Va a eliminar el DetalleVenta" + idDetalleVenta);
            ps.setInt(1, idDetalleVenta);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "DetalleVenta Eliminado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Detalleventa");
        }
}
public void modificarVenta(DetalleVenta detalleventa){
        String sql="update detalleventa set cantidad = ?,idVenta= ?,precioVenta=?,idProducto=? "
                + "where idDetalleVenta=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,detalleventa.getCantidad());
            ps.setInt(2,detalleventa.getVenta().getIdVenta());
            ps.setDouble(3,detalleventa.getPrecioVenta());
            ps.setInt(4,detalleventa.getProducto().getIdProducto());
            ps.setInt(5,detalleventa.getIdDetalleVenta());
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Detalleventa Modificada");
            }
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla DetalleVenta");
        }
        
    }  
  
  public List<Producto>listarProductoXfecha(LocalDate fechaVenta){
        String sql="SELECT * FROM producto WHERE producto.idProducto IN (SELECT detalleventa.IDProducto"
                + " FROM Venta JOIN DetalleVenta ON venta.IDVenta = detalleventa.IDVenta"
                + " WHERE venta.fechaVenta = ?)";
        ArrayList<Producto>productos=new ArrayList();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Producto prod=new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setDescripcion(rs.getString("descripcion"));
                prod.setPrecioActual(rs.getDouble("precioActual"));
                prod.setEstado(rs.getBoolean("estado"));
                
                productos.add(prod);
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla");
        }
        
      return productos;  
    }
    
}

