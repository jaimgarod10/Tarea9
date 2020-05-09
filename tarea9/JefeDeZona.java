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
public class JefeDeZona extends Empleado{
    
    int despacho;
    String matricula,marca, modelo;
    final int incrementoAnual = 20;
    ArrayList <Vendedor> vendedores;
    Secretario secretario;

    public JefeDeZona(String nombre, String apellidos, String DNI, String direccion, int tlf, int salario, int despacho, String matricula, String marca, String modelo) {
        super(nombre, apellidos, DNI, direccion, tlf, salario);
        this.despacho = despacho;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        vendedores = new ArrayList<>();
        this.secretario = null;
    }

    @Override
    public String toString() {
        return "JefeDeZona: " + 
                "despacho: " + despacho + 
                ", matricula: " + matricula + 
                ", marca: " + marca + 
                ", modelo: " + modelo + 
                ", incrementoAnual: " + incrementoAnual + 
                ", vendedores: " + vendedores + 
                ", secretario: " + secretario + 
                super.toString()
                + "\n ";
    }
    
    @Override
    public void imprimir(){
        System.out.println(toString());
    }
    
     public void cambiarScretario(Secretario nuevoSecretario){
        secretario = nuevoSecretario;
    }
     
     public void cambiarCoche(String matricula, String marca, String modelo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        
    }
    
}
