package Banco;


public class Cuenta {
    
    private String nombre;
    private Double saldo;
    
    public Cuenta(String nombre, double saldo){
        
        this.nombre = nombre;
        this.saldo = saldo;
               
    }
    
    
    public void establecerNombre(String nombre){	//Es linea se llama encabezado del mètodo
        this.nombre = nombre;				//Almacenar el nombre
    }
   
    public String obtenerNombre(){				
	return nombre;					//Devuelve el valor de la variable nombre	
    }
    
    public void depositar(double saldo){                //Almacenamos el saldo 
        this.saldo = saldo;
    }
    
    public double obtenerSaldo(){                       //
        return saldo;
    }
    
    public void retirar(double retiro){
        
        if (retiro > this.saldo) {
            System.out.println("“El monto a retirar excede el saldo de la cuenta.");
        } else{
            this.saldo = saldo - retiro;
            System.out.printf("Su saldo actual es de: %.2f%n", this.saldo);
        }
        
    }
    
    
    
    
}
