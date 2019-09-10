/*
Nuestra siguiente aplicación lee (o recibe como entrada) dos enteros que el 
usuario introduce mediante el teclado, después calcula la suma de los valores 
y muestra el resultado. 
 */
package Ejercitacion;

import java.util.Scanner;

/**
 * @author pzanelli
 */
public class Ejercicio_1 {
    
    public static void main(String[] args) {
        
        //Declaramos las variables
        
        int num1;
        int num2;
        int resultado;
        
        //Iniciamos el Scanner para leer el teclado
        Scanner numero = new Scanner(System.in); 
     
        //Leemos por teclado los 2 ingresos
        System.out.println("Ingrese el primer numero:");
        num1 = numero.nextInt();
        
        System.out.println("Ingrese el segundo numero:");
        num2 = numero.nextInt();
        
        //Generamos el resultado
        resultado = num1 + num2;
        
        //Lo mostramos por pantalla
        System.out.printf("La suma de %d y %d es %d%n",num1,num2,resultado);
        
            if (true | false)
        System.out.println("Verdadero");
else
        System.out.println("Falso");
        
    
    }
    
}
