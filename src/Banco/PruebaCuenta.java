package Banco;

import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args){
        
        double saldo;
        double retiro, parcial;
        boolean flag = false;
        
        //Inicializamos el Scanner
        Scanner entrada = new Scanner(System.in);
        
        //Instaciamos la clase cuenta y creamos el objeto miCuenta
        Cuenta miCuenta = new Cuenta("Pablo", "Zanelli", 655, 500, 31662835, 2031662835);
        
        String nombre = miCuenta.obtenerNombre();
        String apellido = miCuenta.obtenerApellido();
        saldo = miCuenta.obtenerSaldo();
        double dolares = miCuenta.obtenerMontoEnDolares();
        int dni = miCuenta.obtenerDni();
        int cuil = miCuenta.obtenerCuil();
        
        if (Integer.toString(dni).length() > 7) {
            if (Integer.toString(cuil).length() > 9) {
                System.out.println(nombre+" "+apellido+" $"+ saldo +" U$D"+ dolares +" " + dni + " " + cuil);
            }

        }
        
        
        //Mostramos por pantalla el nombre de la cuenta, utilizando el metodo obtenerNombre
        //System.out.printf("El nombre inicial es: %s%n%n", miCuenta.obtenerNombre());
        //System.out.println("Introduza el nombre:");
        //String elNombre = miCuenta.obtenerNombre();
        
        //Establecemos el nombre de la cuenta utilizando el metodo establecerNombre
        //miCuenta.establecerNombre(elNombre);
        //System.out.println("");
        
        //System.out.printf("El nombre de la cuenta es: %n%s%n%n", miCuenta.obtenerNombre());
        
        
        //System.out.println("Ingrese el monto a depositar"); 
        
        //saldo = entrada.nextInt();
        
        //miCuenta.depositar(saldo);
        

        
         
            //System.out.println("Ingrese el monto a retirar");
            //retiro = entrada.nextInt();
        
            //miCuenta.retirar(retiro);

        

  
    }
    
}
