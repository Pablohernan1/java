/*
Escribir un programa completo que calcule imprima el producto de tres enteros 
ingresados por el usuario. 
 */
package Ejercitacion;

import java.util.Scanner;

/**
 * @author pzanelli
 */
public class Ejercicio_3 {
    public static void main(String[] args){
        //Inicializamos el scanner
        Scanner numero = new Scanner(System.in);
        
        //Declaramos las variables
        int num1;
        int num2;
        int num3;
        int producto;
        
        //Leemos por teclado los ingresos.
        System.out.println("Ingrese el primer numero entero: ");
        num1 = numero.nextInt();
        
        System.out.println("Ingrese el segundo numero entero: ");
        num2 = numero.nextInt();     
        
        System.out.println("Ingrese el tercer numero entero: ");
        num3 = numero.nextInt();
        
        //Realizo el calculo del producto.
        producto = num1 * num2 * num3;
        
        //Muestro el resultado por pantalla
        System.out.printf("El producto de %dx%dx%d, es igual a: %d%n",num1,num2,num3,producto);
    }
}
