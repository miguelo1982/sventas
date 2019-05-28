/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sventas.accesobd;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel R
 */


public class conexionMySQL {
    Connection con;
   // PreparedStatement pst;
    //ResultSet rs;
    
    //metodo main para poder ejecutar la clase
   // public static void main(String args[]) {
    //    new conceccionMySQL();
    //}
    
    //Construcctor de la clase
    public conexionMySQL() {
        //conectar();
    }
    
    
    
//implementar el metodo Conectar
public Connection conectar()
{
    try{
        Class.forName("com.mysql.jdbc.Driver");//cargar el driver
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/sistvent?user:root&password");
    }
    catch (ClassNotFoundException ex)
    {
        ex.printStackTrace();
        System.out.println("No fue posible encontrar el Driver");
    }
    catch (SQLException ex)
    {
        ex.printStackTrace();
        System.out.println("No fue posible conectar con la BD");
    }
    return con;
}
//implementar el metodo Desconectar
public void desconectar() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
