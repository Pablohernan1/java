/*
Escriba una aplicación que reciba del usuario el radio de un círculo como un
entero, y que imprima el diámetro, la circunferencia y el área del círculo 
mediante el uso del valor de punto flotante 3.14159 para π.  
 */
package Ejercitacion;

import java.util.Scanner;

/**
 * @author pzanelli
 */
public class Ejercicio_7 {
    public static void main(String[] args){
        //inicializamos el Scanner
        Scanner numero = new Scanner(System.in);
        
        //Declaramos las variables
        int radio;
        float diametro;
        float pi = 3.14159f;
        float circunferencia;
        float area;
        
        //Leemos con el Scanner el valor ingresado por el usuario
        System.out.println("Ingrese el Radio del circulo: ");
        radio = numero.nextInt();

        //Realizamos los calculos
        diametro = radio * 2;
        circunferencia = diametro * pi;
        area = pi * (radio*radio);
        
        //Mostramos por pantalla los resultados.
        System.out.printf("la circunferencia es de: %.2f%n", circunferencia);
        System.out.printf("El diamentro es de: %.2f%n", diametro);
        System.out.printf("El area es de: %.2f%n",area);
        
    }
}
