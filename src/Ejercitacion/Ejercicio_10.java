/*
Use Web para determinar la poblacion mundial actual y la tasa de crecimiento 
anual de la poblacion mundial. Escriba una aplicación que reciba estos valores
como entrada y luego muestre la población mundial estimada después de uno, 
dos, tres, cuatro y cinco años.
Actual: 7.600
Anual del 1,2%

 */
package Ejercitacion;

import java.util.Scanner;

/**
 * @author pzanelli
 */
public class Ejercicio_10 {
    public static void main(String[] args){
        
        int poblacion,resultado1,resultado2,resultado3,resultado4,resultado5;
        float tasa,tasa1,tasa2,tasa3,tasa4,tasa5;
        
        Scanner ingreso = new Scanner(System.in);
        
        System.out.println("Ingrese la poblacion mundial actual:");
        poblacion = ingreso.nextInt();
        
        System.out.println("Ingrese la tasa de crecimiento anual: ");
        tasa = ingreso.nextFloat();
        
        tasa1 = poblacion * tasa;
        resultado1 = Math.round(tasa1); 
        tasa2 = tasa1 * tasa;
        resultado2 = Math.round(tasa2); 
        tasa3 = tasa2 * tasa;
        resultado3 = Math.round(tasa3);
        tasa4 = tasa3 * tasa;
        resultado4 = Math.round(tasa4);
        tasa5 = tasa4 * tasa;
        resultado5 = Math.round(tasa5);
        
        
        System.out.printf("Poblacion estimada a 1 año: %d%n",resultado1);
        System.out.printf("Poblacion estimada a 2 años: %d%n",resultado2);
        System.out.printf("Poblacion estimada a 3 años: %d%n",resultado3);
        System.out.printf("Poblacion estimada a 4 años: %d%n",resultado4);
        System.out.printf("Poblacion estimada a 5 años: %d%n",resultado5);
    }
}
