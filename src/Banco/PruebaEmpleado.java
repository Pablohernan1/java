/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author pzanelli
 */
public class PruebaEmpleado {
    public static void main(String[] args){
        
        Empleado empleado1 = new Empleado("Pablo", "Zanelli", 34000);
        Empleado empleado2 = new Empleado("Ezequiel", "Rosso", 29000);
        
        System.out.printf("El sueldo anual de: %s %s es de $%.2f%n", empleado1.nombre, empleado1.apellidoPaterno,(empleado1.salario*12));
        System.out.printf("El sueldo anual de: %s %s es de $%.2f%n", empleado2.nombre, empleado2.apellidoPaterno,(empleado2.salario*12));
        
                
        
    }
}
