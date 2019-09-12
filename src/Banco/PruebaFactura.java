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
        //Utilizamos el constructor
        Factura factura = new Factura("1","tornillo/s",5,22);
        System.out.printf("El numero de pieza es: %s, la descripcion de la pies "
                + "es: %s, la cantidad en stock es de: %d, y el precio es de: $"
                + "%.2f%n%n",factura.obtenerNumPieza(), factura.obenerDescPieza(), factura.obtenerStock() , factura.obtenerPrecio());
       
        //Verificamos que fucionen los metodos para establecer y obtener.
        factura.establecerDescPieza("clavo/s");
        factura.establecerPrecio(3);
        factura.establecerStock(15);
        System.out.printf("Hay %d %s en stock y el precio es de: $%.2f c/u%n%n",factura.obtenerStock() ,factura.obenerDescPieza(), factura.obtenerPrecio());
       
        //Utilizamos el metodo de obtener Monto, y verificamos que los importes se muestren segun lo pedido.
        factura.establecerStock(2);
        factura.establecerPrecio(10);
        factura.obtenerMontoFactura();
        
        //si el stock es menor a 0, se tiene que mostrar el monto igual a 0
        factura.establecerStock(-2);
        factura.establecerPrecio(10);
        factura.obtenerMontoFactura();
        
        //si el precio es infreior a 0, se tiene que mostrar el monto igual a 0.0
        factura.establecerStock(2);
        factura.establecerPrecio(-10);
        factura.obtenerMontoFactura();
    
    }
}
