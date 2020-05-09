/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea9;

import java.util.ArrayList;

/**
 *
 * @author jaimg
 */
public class Empresa {
    
    ArrayList <Empleado> empleados;
    String producto;
    String nombreEmpresa;

    public Empresa( String producto, String nombreEmpresa) {
        this.empleados = new ArrayList<>();
        this.producto = producto;
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa: " + 
                "empleados:" + empleados + 
                ", producto: " + producto + 
                ", nombreEmpresa: " + nombreEmpresa;
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    
}
