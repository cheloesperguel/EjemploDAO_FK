/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufro.cuentagastos.modelo;

import java.util.ArrayList;

/**
 *
 * @author Marcelo Esperguel
 */
public class Cuenta {
    
    private int id;
    private int total;
    private String propietario;
    private ArrayList<Gasto> gastos;  

    public Cuenta(int id, int total, String propietario, ArrayList<Gasto> gastos) {
        this.id = id;
        this.total = total;
        this.propietario = propietario;
        this.gastos = gastos;
    }
    
    public Cuenta(int total, String propietario, ArrayList<Gasto> gastos) {
        this.id = id;
        this.total = total;
        this.propietario = propietario;
        this.gastos = gastos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public ArrayList<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(ArrayList<Gasto> gastos) {
        this.gastos = gastos;
    }
    
    
    
    
}
