
package Banco;


public class Factura {
    
    String numPieza;
    String descPieza;
    int stock;
    double precio;
    
    
    public Factura(String numPieza, String descPieza, int stock, double precio){
        
        this.numPieza = numPieza;
        this.descPieza = descPieza;
        this.stock = stock;
        this.precio = precio;
        
    }
    
    
    
    public String obtenerNumPieza(){
        return numPieza;
    }
    public void  establecerNumPieza(String numPieza){
        this.numPieza = numPieza;
    }
    
    
    
    public String obenerDescPieza(){
        return descPieza;
    }
    public void establecerDescPieza(String descPieza){
    this.descPieza = descPieza;
    }
    
    
    
    public int obtenerStock(){
        return stock;        
    }
    public void establecerStock(int stock){
        this.stock = stock;
    }
    
    
    
    public double obtenerPrecio(){
        return precio;        
    }
    public void establecerPrecio(double precio){
        this.precio = precio;
    }
    
    
    public double obtenerMontoFactura(){
        
        double monto = this.stock * this.precio;
        if (monto < 1) {
           monto = this.precio = 0;
           
        }
        return monto;
    }
    
    
}
