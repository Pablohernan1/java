
package Banco;


public class Empleado {
    
    String nombre;
    String apellidoPaterno;
    double salario;

    public  Empleado(String nombre, String apellidoPaterno, double salario){
        
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        if (salario > 0) {
            this.salario = salario;
        }
        

    }
    
    //Proporcione un método establecer y un método obtener para cada variable de instancia
    
    public void establcerNombre(String nombre){
         this.nombre = nombre;
    }
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establcerApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }
    public String apellidoPaterno(){
        return apellidoPaterno;
    }
    
    public void establcerSalario(double salario){
        
        if (salario > 0) {
            this.salario = salario;
        } 
    }
    public double obtenerSalario(){
        return salario;
    }
    
}
