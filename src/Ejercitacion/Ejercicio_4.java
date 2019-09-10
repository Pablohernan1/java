/*
Escriba una aplicación que pida al usuario que escriba dos números, que 
obtenga los números del usuario e imprima la suma si son iguales, producto si 
son diferentes, diferencia si el primero es mayo que el segundo y cociente si el
segundo es mayor que el primero(división) de los números. 
 */
package Ejercitacion;

import java.util.Scanner;

/**
 * @author pzanelli
 */
public class Ejercicio_4 {
    public static void main(String[] args){
        
        //Declaramos las variables.
        int num1;
        int num2;
        int suma;
        int producto;
        int diferencia;
        int cociente;
        //Inicializamos el Scanner
        Scanner numero = new Scanner(System.in);
        
        //Utilizamos el scanner para leer las entradas por teclado
        System.out.println("Ingrese el primer numero:");
        num1 = numero.nextInt();
        
        System.out.println("Ingrese el segundo numero:");
        num2 = numero.nextInt();
        
        //Utilizamos el IF para verificar todas las condiciones.
        if (num1 == num2) {
            suma = num1 + num2;
            System.out.printf("La suma de %d + %d, es igual a: %d%n",num1,num2,suma);
        }
        
        if (num1 != num2) {
            producto = num1*num2;
            System.out.printf("El producto de %d x %d, es igual a: %d%n ",num1,num2,producto);
        }
        
        if (num1 < num2) {
            diferencia = num1-num2;
            System.out.printf("La diferencia entre %d - %d es igual a: %d%n",num1,num2,diferencia);
        }
        
        if (num1 > num2) {
            cociente = num1/num2;
            System.out.printf("El cociente entre %d / %d, es igual a: %d%n",num1,num2,cociente);
        }
    }
}
