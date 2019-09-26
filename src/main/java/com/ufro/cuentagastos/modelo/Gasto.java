/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.cuentagastos.modelo;

/**
 *
 * @author Marcelo Esperguel
 */
public class Gasto {
    
    private int id;
    private int monto;
    
    private Cuenta cuenta;

    public Gasto(int id, int monto, Cuenta cuenta) {
        this.id = id;
        this.monto = monto;
        this.cuenta = cuenta;
    }
    
     public Gasto( int monto, Cuenta cuenta) {
        
        this.monto = monto;
        this.cuenta = cuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
