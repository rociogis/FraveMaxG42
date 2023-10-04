/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax.AccesoADatos;

import fravemax.Entidades.DetalleVenta;
import fravemax.Entidades.Producto;
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
    private Connection con=null;
    
    public DetalleVentaData(){
        con=Conexion.getConexion();
    }
    
    public void cargarDetalleVenta(DetalleVenta detVenta){
        String sql="INSERT INTO detalleVenta(cantidad,idVenta,precioVenta,idProducto) "
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,detVenta.getCantidad());
            ps.setInt(2,detVenta.getVenta().getIdVenta());
            ps.setDouble(3,detVenta.getPrecioVenta());
            ps.setInt(4,detVenta.getProducto().getIdProducto());
            
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                detVenta.setIdDetalleVenta(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"DetalleVenta Cargado");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla DetalleVenta");
        }
                
                
    }
    
    public List<Producto>listarProductoXfecha(LocalDate fechaVenta){
        String sql="SELECT * FROM producto WHERE producto.idProducto =  (SELECT detalleventa.IDProducto"
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
