/*
Escriba una aplicación que pida al usuario que escriba dos enteros, que obtenga
los números del usuario y muestre el número más grande, seguido de las 
palabras “es más grande”. Si los números son iguales, imprima el mensaje 
“Estos números son iguales”. 
*/
package Ejercitacion;

import java.util.Scanner;

/**
 * @author pzanelli
 */
public class Ejercicio_5 {
    public static void main(String[] args){
        //Declaramos las variables
        int num1;
        int num2;
        //Inicilizamos el Scanner
        Scanner numero = new Scanner(System.in);
        
        //Leemos con el Scanner, la entrada por teclado que realiza el usuario
        System.out.println("Ingrese un numero entero: ");
        num1 = numero.nextInt();
        
        System.out.println("Ingrese un numero entero: ");
        num2 = numero.nextInt();
        
        //Utilizamos un IF para cada verificacion.
        if (num1 > num2) {
            System.out.printf("El mayor numero ingresado fue %d%n ",num1);
        } 
        if (num2 > num1){
            System.out.printf("El mayor numero ingresado fue %d%n ",num2);
        }
        
        if (num1 == num2) {
            System.out.printf("Los numeros %d y %d son iguales%n",num1,num2);
        }
    } 
                
        
                
        
        
        
    
    
}
