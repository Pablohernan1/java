/*
Escriba una aplicación de prueba llamada PruebaEmpleado,
* que demuestre las capacidades de la clase Empleado. Cree dos objetos Empleado y
* muestre el salario anual de cada objeto. Después, proporcione a cada Empleado un 
* aumento del 10% y muestre el salario anual de cada Empleado otra vez.
*/
package Banco;

/**
 * @author Pablo Zanelli
 **/
public class PruebaEmpleado {
    public static void main(String[] args){
        
        //Crear dos objetos Empleado y muestre el salario anual de cada objeto.
        Empleado empleado1 = new Empleado("Gaston", "Bomrad", 50000);
        Empleado empleado2 = new Empleado("Flavio", "Pando", 29000);
        
        System.out.printf("El sueldo anual de: %s %s es de $%.2f%n", empleado1.nombre, empleado1.apellidoPaterno,(empleado1.obtenerSalario()*12));
        System.out.printf("El sueldo anual de: %s %s es de $%.2f%n", empleado2.nombre, empleado2.apellidoPaterno,(empleado2.obtenerSalario()*12));
        
        
        //Proporcionar a cada Empleado un aumento del 10% y muestrar el salario anual de cada Empleado otra vez.
        empleado1.establcerSalario(empleado1.salario*1.1);
        empleado2.establcerSalario(empleado1.salario*2.1);
        
        System.out.printf("El Salario de %s %s incrementado es de $%.2f%n", empleado1.nombre, empleado1.apellidoPaterno, empleado1.obtenerSalario());        
        System.out.printf("El Salario de %s %s incrementado es de $%.2f%n", empleado2.nombre, empleado2.apellidoPaterno, empleado2.obtenerSalario());
         
    }
}
