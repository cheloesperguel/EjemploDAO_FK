/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.cuentagastos.dao;

import com.ufro.cuentagastos.modelo.Cuenta;
import com.ufro.cuentagastos.modelo.Gasto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Marcelo Esperguel
 */
public class GastoDAO {
    
    private Conexion con;

    public GastoDAO() {
        con = new Conexion();
    }
    
    public ArrayList<Gasto> getGastos(){
        
        ArrayList<Gasto> gastos=new ArrayList<>();
        
        String sql = "SELECT * FROM gasto";
        CuentaDAO cDAO = new CuentaDAO();
        try{
            Connection accesoBD = con.getConexion();
            Statement st = accesoBD.createStatement();
            
            ResultSet rs = st.executeQuery(sql);  // PARA OBTENER
            
            while(rs.next()){
                
                int id = rs.getInt("id");
                int monto = rs.getInt("monto");
                int id_cuenta = rs.getInt("id_cuenta");
                
                Cuenta c = cDAO.getById(id_cuenta);
                
                gastos.add( new Gasto(id, monto, c));

            }
            return gastos;
        }catch(Exception e){
            e.printStackTrace();
             return null;
        }
       
       
        
    }
    
    public ArrayList<Gasto> getGastosByIdCuenta(int idCuenta){
        ArrayList<Gasto> gastos=new ArrayList<>();
        
        String sql = "SELECT * FROM gasto WHERE id_cuenta="+idCuenta;
        CuentaDAO cDAO = new CuentaDAO();
        try{
            Connection accesoBD = con.getConexion();
            Statement st = accesoBD.createStatement();
            
            ResultSet rs = st.executeQuery(sql);  // PARA OBTENER
            
            while(rs.next()){
                
                int id = rs.getInt("id");
                int monto = rs.getInt("monto");
                int id_cuenta = rs.getInt("id_cuenta");
                
                Cuenta c = cDAO.getById(id_cuenta);
                
                gastos.add( new Gasto(id, monto, c));

            }
            return gastos;
        }catch(Exception e){
            e.printStackTrace();
             return null;
        }
    }
    
    
}
