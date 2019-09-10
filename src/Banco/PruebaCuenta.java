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
        Cuenta miCuenta = new Cuenta();
        //Mostramos por pantalla el nombre de la cuenta, utilizando el metodo obtenerNombre
        System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());
        System.out.println("Introduza el nombre:");
        String elNombre = entrada.nextLine();
        
        //Establecemos el nombre de la cuenta utilizando el metodo establecerNombre
        miCuenta.establecerNombre(elNombre);
        System.out.println("");
        
        System.out.printf("El nombre de la cuenta es: %n%s%n%n", miCuenta.obtenerNombre());
        
        
        System.out.println("Ingrese el monto a depositar"); 
        
        saldo = entrada.nextInt();
        
        miCuenta.depositar(saldo);
        

        
        while (flag == false) {    
            System.out.println("Ingrese el monto a retirar");
            retiro = entrada.nextInt();
        
            parcial = miCuenta.obtenerSaldo() - retiro;
            
            if (parcial < 0) {
                System.out.println("saldo insuficiente");
                System.out.printf("Su saldo actual es de: %d%n%n", saldo);

            } else {
                System.out.printf("La cuenta de %s tiene un saldo de: $%.2f%n",elNombre,parcial);
                flag = true;
            }
        }
  
    }
    
}
