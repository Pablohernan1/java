/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobreCarga;

/**
 *
 * @author pzanelli
 */
public class SobreCargaDeMetodos {
    public static void main(String[] args){
        
        
        System.out.printf("El cuadrado del entero es igual a %d%n%n", cuadrado(7));
        System.out.printf("El cuadrado del double es igual a %.2f%n%n", cuadrado(7.5));
        
    }    
    public static int cuadrado(int num1){
            System.out.printf("Se llamo al metodo cuadrado del entero: %d%n", num1);
        return num1 * num1;
    }
    
        public static double cuadrado(double num2){
            System.out.printf("Se llamo al metodo cuadrado del double: %.2f%n", num2);
        return num2 * num2;
    }
        
    
}
