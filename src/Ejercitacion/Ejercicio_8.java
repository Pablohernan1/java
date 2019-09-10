/*
Escriba una aplicación que reciba del usuario un número compuesto por cinco
dígitos, que separe ese número en sus dígitos individuales y los imprima, 
cada uno separado de los demás por tres espacios. Por ejemplo, si el usuario 
escribe el número 42339, el programa debe imprimir 
 */
package Ejercitacion;

import java.util.Scanner;

/**
 * @author pzanelli
 */
public class Ejercicio_8 {
    public static void main(String[] args){
        Scanner numero = new Scanner(System.in);
        
        
        int num1;
        int flag = 0;
        char a,b,c,d,e;
        
        
        
        //Utilizamos el ciclo While, para que el programa continue hasta que el usuario ingrese
        //correctamente la cantidad de digitos.
        while (flag == 0) { 
            System.out.println("Inegrese un numero de 5 digitos");
            num1 = numero.nextInt();
            
            
            //Convertimos a String el entero ingresado por el usuario.
            String numStr = Integer.toString(num1);
            
            //Validamos que el usuario ingrese si o si 5 digitos.
            if (numStr.length() < 5 || numStr.length() > 5) {
                System.out.println("error al ingresar el numero");
            }
            
            //Asignamos a cada variable el char correspondiente
            a = numStr.charAt(0);
            b = numStr.charAt(1);
            c = numStr.charAt(2);
            d = numStr.charAt(3);
            e = numStr.charAt(4);
            
            //Mostramos la cadena separada por 3 espacios.
            System.out.printf("%c   %c   %c   %c   %c%n",a,b,c,d,e);
            
            //Cambiamos el valor de la bandera para que termine el programa.
            flag = 1;
            
        }

        
        
        
    }
}
