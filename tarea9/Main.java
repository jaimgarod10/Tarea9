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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empresa e = new Empresa("Grifos", "Griferias SL");
        Empleado emp1 = new Empleado("Felipe","Hermoso", "12492J", "calle mandela 4", 1314413, 200);
        Empleado emp2 = new Empleado("Jorge","Hermoso", "92592T", "calle mandela 4", 32314453, 500);
        Secretario scre = new Secretario("Servidor", "Amable", "943034O", "ventanillas 14", 98643748, 350, 1, 73984);
        Vendedor vend1 = new Vendedor("Pepe", "Orgulloso", "578493U", "Vistas 57", 3793285, 550, "V-4057", "Renault", "X", "Barcelona", "Marcel,Manuel, Francisco", 734932, 1);
        Vendedor vend2 = new Vendedor("Juan", "Elmagnifico", "987623B", "Super Ventas 2000", 34129432, 800, "The Boss", "Mercedes", "Pro", "Paris", "Laura,El Corte Ingles, Paco", 9867283, 2);
        JefeDeZona j = new JefeDeZona("Antonio", "Gonzalez", "1298345X", "Calle Toledo 25", 2918123, 1000, 1,"M-2109", "Audi", "4");
        
        e.empleados.add(emp1);
        e.empleados.add(emp2);
        e.empleados.add(scre);
        e.empleados.add(vend1);
        e.empleados.add(vend2);
        e.empleados.add(j);
        
        j.vendedores.add(vend1);
        j.vendedores.add(vend2);
        j.cambiarScretario(scre);
        
        vend1.cambioSuper(j);
        vend2.cambioSuper(j);
        
        vend1.cambiarScretario(scre);
        vend2.cambiarScretario(scre);
        
        scre.cambioSuper(j);
        
        e.imprimir();
        
    }
    
}
