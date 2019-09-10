/*
Compara enteros utilizando instrucciones if, operadores relacional y de 
igualdad. Indicando si estos dos números son, iguales, diferentes, mayor que, 
menor que, mayor o igual que, menor o igual que.
 */
package Ejercitacion;

import java.util.Scanner;

/**
 * @author pzanelli
 */
public class Ejercicio_2 {
        public static void main(String[] args){
            //Inicializamos el Scanner
            Scanner numero = new Scanner(System.in);
            
            //Declaramos las variables.
            int num1;
            int num2;
            
            //Leemos por teclado los 2 ingresos.
            System.out.println("Ingrese un numero entero;");
            num1 = numero.nextInt();
            
            System.out.println("Ingrese otro numero entero:");
            num2 = numero.nextInt();
            
            //Utilizamos un IF para cada verificacion.
            if (num1 == num2) {
                System.out.printf("%d es igual a %d%n", num1, num2);
            }
            if (num1 <= num2) {
                System.out.printf("%d es menor o igual a %d%n", num1,num2);
            }
            if (num1 >= num2) {
                System.out.printf("%d es mayor o igual a %d%n", num1, num2);
            }
            if (num1 < num2) {
                System.out.printf("%d es menor a %d%n", num1, num2);         
            }
            if (num1 > num2) {
                System.out.printf("%d es mayor a %d%n", num1, num2);
            }
            if (num1 != num2) {
                System.out.printf("%d es diferente %d%n", num1, num2);         
            }
            
            
        }
}
