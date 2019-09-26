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
public class CuentaDAO {
    
    private Conexion con;

    public CuentaDAO() {
        con = new Conexion();
    }
    
    public Cuenta getById(int idCuenta){
        
        Cuenta c = null;
        
        // SELECT * FROM cuenta WHERE id=0;
        
        String sql = "SELECT * FROM cuenta WHERE id="+idCuenta;
        GastoDAO gDao = new GastoDAO();
        try{
            Connection accesoBD = con.getConexion();
            Statement st = accesoBD.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.first()){
                int id= rs.getInt("id");
                String propietario = rs.getString("propietario");
                int total = rs.getInt("total");
                
                ArrayList<Gasto> gastosCuenta = gDao.getGastosByIdCuenta(id);
                
                c = new Cuenta(id, total,propietario, gastosCuenta);
                
                return c;
            }else{
                return null;
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return c;
    }
    
    
}
