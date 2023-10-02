/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fravemax.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 54351
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="FraveMax";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;

    public Conexion() {
    }
    
     public static Connection getConexion(){
        if(connection==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
                JOptionPane.showMessageDialog(null,"CONECTADO");
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error al cargar los driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al cargarse la BD");
            }
        }
     return connection;
    }
    
}
