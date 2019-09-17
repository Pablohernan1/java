package Banco;

public class Cuenta {
    
    private String nombre, apellido;
    private double saldo,montoEnDolares;
    private int dni, cuil;
    
    public Cuenta(String nombre, String apellido, double saldo, double montoEnDolaes, int dni, int cuil){
        
        this.nombre = nombre;
        this.apellido = apellido; 

        if (Integer.toString(dni).length() >= 7) {
            this.dni = dni;

        
            if (Integer.toString(cuil).length() >= 10) {
                this.cuil = cuil;
        

                if (saldo >= 0) {
                    this.saldo = saldo;
                } else System.out.println("El saldo inicial en $ no puede ser infrerior a 0");

                if (montoEnDolares >= 0) {
                    this.montoEnDolares = montoEnDolaes;
                } else System.out.println("El saldo inicial en U$D no puede ser infrerior a 0");
                
            } else System.out.println("El numero de cuil debe tener al menos 7 digitos.");
            
        } else System.out.println("El numero de dni debe tener al menos 7 digitos.");
    }
    
    public Cuenta(String nombre, String apellido, double montoEnDolares){
                
        this.nombre = nombre;
        this.apellido = apellido; 

                if (montoEnDolares >= 0) {
                    this.montoEnDolares = montoEnDolares;
                } else System.out.println("El saldo inicial en U$D no puede ser infrerior a 0");

    }

    public Cuenta(double saldo, String nombre, String apellido){
                        
        this.nombre = nombre;
        this.apellido = apellido; 

        if (saldo >= 0) {
            this.saldo = saldo;
        } else System.out.println("El saldo inicial en $ no puede ser infrerior a 0");
    }
       
    public void establecerNombre(String nombre){	//Es linea se llama encabezado del mètodo
        this.nombre = nombre;				//Almacenar el nombre
    }

    public String obtenerNombre(){				
	return nombre;					//Devuelve el valor de la variable nombre	
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public double obtenerSaldo(){                       
        return saldo;
    }
    
    public double obtenerMontoEnDolares(){
        return montoEnDolares;
    }
    
    public int obtenerDni(){
        return dni;
    }
    
    public int obtenerCuil(){
        return cuil;
    }
    
    public void depositar(double saldo){                //Almacenamos el saldo 
        this.saldo = saldo;
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
