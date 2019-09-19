
package Arreglos;

import java.util.Scanner;


public class PruebaLibroCalificaciones {
    
    
    
    
    public static void main(String[] args){
        int largo, nota;
        int calificaciones[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantas notas va a ingresar?");
        largo = scanner.nextInt();
        
         calificaciones = new int[largo];
        
        for (int i = 0; i < largo; i++) {
            System.out.println("Ingrese la primer nota: ");
            nota = scanner.nextInt();
            calificaciones[i] = nota;
        }

        LibroCalificaciones libroCalificaciones = new LibroCalificaciones("Los gatos",  calificaciones );
        

    }
    
    
}
