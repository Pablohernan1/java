/*
Escriba una aplicacion que reciba tres enteros del usuario y muestre la suma,
promedio, producto, menor y mayor de esos números. 
 */
package Ejercitacion;

import java.util.Scanner;

/**
 * @author pzanelli
 */
public class Ejercicio_6 {
    

    public static void main(String[] args){
        
        //Declaro las variables
        int num1;
        int num2;
        int num3;
        int producto;
        int promedio;
        int suma;
        
        //Inicializo el Scanner
        Scanner numero = new Scanner(System.in);
        
        //Utilizamos el scanner para leer los 3 valores por eclado
        System.out.println("ingrese el primer numero: ");
        num1 = numero.nextInt();
        System.out.println("ingrese el primer numero: ");
        num2 = numero.nextInt();        
        System.out.println("ingrese el primer numero: ");
        num3 = numero.nextInt(); 
        
        
        //Realizamos los calculos
        producto = num1*num2*num3;
        suma = num1+num2+num3;
        promedio = (num1+num2+num3)/3;
        
        //Mostramos por pantalla los resultados
        System.out.printf("El promedio es igual a: %d%n",promedio);
        System.out.printf("La suma es igual a: %d%n",suma);
        System.out.printf("El producto es igual a: %d%n",producto);
        
        
        
        //Utilizamos el If para cada validacion.
        if (num1 > num2 && num1 > num3) {
            System.out.printf("%d es mayor que %d y %d%n",num1,num2,num3);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.printf("%d es mayor que %d y %d%n",num2,num1,num3);   
        }
        if (num3 > num1 && num3 > num2) {
            System.out.printf("%d es mayor que %d y %d%n",num3,num1,num2);    
        }
        
        if (num1 < num2 && num1 < num3) {
            System.out.printf("%d es menor que %d y %d%n",num1,num2,num3);
        }
        if (num2 < num1 && num2 < num3) {
            System.out.printf("%d es menor que %d y %d%n",num2,num1,num3);   
        }
        if (num3 < num1 && num3 < num2) {
            System.out.printf("%d es menor que %d y %d%n",num3,num1,num2);    
        }
        
        
        
        
        
    }
}