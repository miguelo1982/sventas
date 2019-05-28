/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sventas.control;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import py.com.sventas.accesobd.conexionMySQL;
import py.com.sventas.bean.clienteBean;

/**
 *
 * @author Miguel Recalde
 */
public class clienteControl {
    PreparedStatement pst;
    ResultSet rs;
    String consultarCliente = "SELEC * FROM CLIENTE WHERE NOM_CLIENTE LIKE ?";
    public clienteControl()
    {
    
    }
    
    public List<clienteBean> listarClientes(String nombre){
        List <clienteBean> clientes=null;
        
        try{
           conexionMySQL mysql = new conexionMySQL();
           pst = mysql.conectar().prepareStatement(consultarCliente);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return clientes;
    }
    
}
