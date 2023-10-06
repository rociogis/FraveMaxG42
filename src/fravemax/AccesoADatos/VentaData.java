/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax.AccesoADatos;
import fravemax.Entidades.Cliente;
import fravemax.Entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class VentaData {
 private Connection con = null;   
  public VentaData(){
  con = Conexion.getConexion();
  }

public void registraVenta(Venta venta) throws SQLException{
    String sql = "INSERT into venta(idCliente,fechaVenta) VALUES (?,?)";
     try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,venta.getCliente().getIdCliente());
            ps.setDate(2,Date.valueOf(venta.getFechaVenta()));
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                venta.setIdVenta(rs.getInt(1));
                 JOptionPane.showMessageDialog(null,"VENTA REGISTRADA");
            }
} catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al Acceder a la tabla");
}
}
public void eliminarVenta(int idVenta){
 String sql = "DELETE FROM venta WHERE Venta.idVenta = ?;";
 
 try {
            PreparedStatement ps = con.prepareStatement(sql);
            JOptionPane.showMessageDialog(null, "Va a eliminar la venta " + idVenta);
            ps.setInt(1, idVenta);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Venta Eliminada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Venta");
        }
}
public void modificarVenta(Venta venta){
        String sql="update venta set idCliente=?,fechaVenta=? "
                + "where idVenta=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,venta.getCliente().getIdCliente());
            ps.setDate(2,Date.valueOf(venta.getFechaVenta()));
            ps.setInt(3,venta.getIdVenta());
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null,"Venta Modificada");
            }
            ps.close();    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Venta");
        }
        
    }

}
