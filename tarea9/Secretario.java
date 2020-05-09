/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea9;

/**
 *
 * @author jaimg
 */
public class Secretario extends Empleado{
    
    int despacho, num_fax; 
    final int incrementoAnual = 5;
    
    
    public Secretario(String nombre, String apellidos, String DNI, String direccion, int tlf, int salario, int despacho, int num_fax){
        super(nombre, apellidos,DNI,direccion,tlf,salario);
        this.despacho = despacho;
        this.num_fax = num_fax;
    }

    @Override
    public String toString() {
        return "Secretario: " + 
                "despacho: " + despacho +
                ", num_fax: " + num_fax + 
                ", incrementoAnual: " + incrementoAnual 
                + super.toString()
                + "\n ";
    }
    
    @Override
    public void imprimir(){
        System.out.println(toString());
    }
    
}
