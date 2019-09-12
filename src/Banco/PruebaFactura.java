/*
* Cree una clase llamada Factura que una ferretería podría utilizar para 
* representar unafactura para un artículo vendido en la tienda. Una Factura debe 
* incluir cuatro piezas de información como variables de instancia: un número de 
* pieza (tipo String), la descripción de la pieza (tipo String), la cantidad de 
* artículos de ese tipo que se van a comprar (tipo int) y el precio por artículo 
* (double). Su clase debe tener un constructor que inicialice las cuatro variables
* de instancia. Proporcione un método establecer y un método obtener para cada 
* variable de instancia. Además, proporcione un método llamado 
* obtenerMontoFactura, que calcule el monto de la factura (es decir, 
* que multiplique la cantidad de artículos por el precio de cada uno) y después 
* devuelva ese monto como un valor double. Si la cantidad no es positiva, debe 
* establecerse en 0. Si el precio por artículo no es positivo, debe establecerse 
* en 0.0.
 */
package Banco;

/**
 * @author Pablo Zanelli
 **/
public class PruebaFactura {
    public static void main(String[] args){
        
        Factura factura = new Factura("1","Tornillo",-1,2);
        
        factura.establecerDescPieza("tornillo/s");
        factura.establecerPrecio(3);
       // factura.establecerStock(15);
        System.out.printf("El precio de %d %s es de: $%.2f%n",factura.obtenerStock() ,factura.obenerDescPieza(), factura.obtenerMontoFactura());
       
        
        //Verificamos que si el precio es inferior a 0, no granbe el precio.

        

        
        
        
        
    }
}
