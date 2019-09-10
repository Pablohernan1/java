package Banco;


public class Cuenta {
    
    private String nombre;
    private Double saldo;
    
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
    
    
    
}
