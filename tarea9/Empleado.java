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
public class Empleado {
    
    String nombre, apellidos, DNI, direccion;
    int anos_ant, tlf, salario;
    Empleado supervisor;

    public Empleado(String nombre, String apellidos, String DNI, String direccion, int tlf, int salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.tlf = tlf;
        this.salario = salario;
        supervisor = null;
    }

    @Override
    public String toString() {
        return "Empleado: " +
                " nombre: " + nombre + 
                ", apellidos: " + apellidos + 
                ", DNI: " + DNI + 
                ", direccion: " + direccion + 
                ", años_ant: " + anos_ant + 
                ", tlf: " + tlf + 
                ", salario: " + salario
                + "\n ";
    }
    
    public void imprimir(){
        System.out.println(toString());
    }
    
    public void cambioSuper(Empleado nuevoSuper){
        supervisor = nuevoSuper;
    }
    
    public void incrementaSalario(int aumento){
        salario += aumento;
    }
    
}
