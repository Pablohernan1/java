/*
* Cree una clase llamada Empleado, que incluya tres variables de instancia: 
* un primer nombre (tipo String), un apellido paterno (tipo String) y un salario 
* mensual (double). Su clase debe tener un constructor que inicialice las tres 
* variables de instancia. Proporcione un método establecer y un método obtener 
* para cada variable de instancia. Si el salario mensual no es positivo, 
* no establezca su valor. 
*/
package Banco;

/**
 * @author Pablo Zanelli
 **/
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
    
    //Proporcionamos un método para establecer y un método para obtener para cada variable de instancia
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
