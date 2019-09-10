package Banco;

import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args){
        
        int saldo;
        double retiro, parcial;
        boolean flag = false;
        
        //Inicializamos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Instaciamos la clase cuenta y creamos el objeto miCuenta
        Cuenta miCuenta = new Cuenta("Pablo Zanelli", 1500);
        
        
        
        //Mostramos por pantalla el nombre de la cuenta, utilizando el metodo obtenerNombre
        //System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());
        //System.out.println("Introduza el nombre:");
        String elNombre = miCuenta.obtenerNombre();
        
        //Establecemos el nombre de la cuenta utilizando el metodo establecerNombre
        //miCuenta.establecerNombre(elNombre);
        //System.out.println("");
        
        //System.out.printf("El nombre de la cuenta es: %n%s%n%n", miCuenta.obtenerNombre());
        
        
        //System.out.println("Ingrese el monto a depositar"); 
        
        //saldo = entrada.nextInt();
        
        //miCuenta.depositar(saldo);
        

        
         
            System.out.println("Ingrese el monto a retirar");
            retiro = entrada.nextInt();
        
            miCuenta.retirar(retiro);

        

  
    }
    
}
