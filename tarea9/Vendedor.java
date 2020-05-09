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
public class Vendedor extends Empleado{
    
    String matricula, marca, modelo, area_venta, lista_clientes;
    int tlfMobil, pocent_ventas;
    final int incrementoAnual = 10;
    Secretario secretario;

    public Vendedor(String nombre, String apellidos, String DNI, String direccion, int tlf, int salario,String matricula, String marca, String modelo, String area_venta, String lista_clientes, int tlfMobil, int pocent_ventas) {
        super(nombre, apellidos, DNI, direccion, tlf, salario);
        cambiarCoche(matricula, marca, modelo);
        this.area_venta = area_venta;
        this.lista_clientes = lista_clientes;
        this.tlfMobil = tlfMobil;
        this.pocent_ventas = pocent_ventas;
        secretario = null;
    }

    @Override
    public String toString() {
        return "Vendedor: " +
                "matricula: " + matricula + 
                ", marca: " + marca + 
                ", modelo: " + modelo + 
                ", area_venta: " + area_venta + 
                ", lista_clientes: " + lista_clientes + 
                ", tlfMobil: " + tlfMobil + 
                ", pocent_ventas: " + pocent_ventas + 
                ", incrementoAnual: " + incrementoAnual +
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
