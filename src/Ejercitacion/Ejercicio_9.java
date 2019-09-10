/*
Cree una calculadora del BMI que lea el peso del usuario en libras y la altura 
en pulgadas (o, si lo prefiere, el peso del usuario en kilogramos y la altura 
en metros), para que luego calcule y muestre el índice de masa corporal del 
usuario. Muestre además la siguiente información del Departamento de Salud y 
Servicios Humanos/Instituto Nacional de Salud para que el usuario pueda evaluar 
su BMI
 */
package Ejercitacion;

import java.util.Scanner;

/**
 * @author pzanelli
 */
public class Ejercicio_9 {
    public static void main(String[] args){
        
        Scanner ingreso = new Scanner(System.in);
        
        int peso;
        float altura;
        float imc;
        
        System.out.println("Ingrese su peso en KG");
        peso = ingreso.nextInt();
        
        System.out.println("Ingrese su altura");
        altura = ingreso.nextInt();
        
        altura = altura / 100;      //Lo utilizo para convertir a decimal

        imc =peso / (altura * altura);
        
        System.out.printf("Su imc es igual a %.2f Kg/m2%n", imc);
        
        if (imc < 18.5) {
            System.out.println("Usted tiene Bajo Peso"); 
        }
         if (imc >18.4 && imc <24.9) {
             System.out.println("Usted tiene un peso normal");
        }
        if (imc > 25 && imc < 29.99) {
            System.out.println("Usted tiene Sobrepeso");
        }
    }
}
