/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author pzanelli
 */
public class PruebaFactura {
    public static void main(String[] args){
        
        Factura factura = new Factura("1","Tornillo",-5,6);
        
        System.out.printf("%.1f%n",factura.obtenerMontoFactura());
       
        
        
        
        
        
    }
}
