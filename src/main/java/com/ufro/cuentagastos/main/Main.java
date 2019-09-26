/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.cuentagastos.main;
import com.ufro.cuentagastos.dao.CuentaDAO;
import com.ufro.cuentagastos.dao.GastoDAO;
import com.ufro.cuentagastos.modelo.Cuenta;
import com.ufro.cuentagastos.modelo.Gasto;
import java.util.ArrayList;

/**
 *
 * @author Marcelo Esperguel
 */
public class Main {
    
    public static void main(String args[]){
        
        CuentaDAO cDao = new CuentaDAO();
        
        Cuenta c = cDao.getById(1);
        
        System.out.println(c.getGastos().get(0).getMonto());
        
//        GastoDAO gastoDao = new GastoDAO();
//        
//        ArrayList<Gasto> gastos = gastoDao.getGastos();
        
        
//        gastos.forEach( (g) ->{
//            System.out.print(g.getMonto() +" ");
//                    
//            System.out.println(g.getCuenta().getPropietario());
//        });
        
        
    }
}
