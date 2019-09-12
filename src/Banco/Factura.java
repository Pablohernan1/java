
package Banco;


public class Factura {
    
    String numPieza;
    String descPieza;
    int stock;
    double precio;
    
    
    public Factura(String numPieza, String descPieza, int stock, double precio){
        
        this.numPieza = numPieza;
        this.descPieza = descPieza;

        this.precio = precio;
        
        if (stock < 1 || precio < 1) {
            this.stock = 0;
            this.precio = 0;

        } else {
            this.stock = stock;
            this.precio = precio;
        }
        
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
        
        double monto = 0; 
        if (this.stock < 1 ) {
            System.out.printf("El monto de la factura es de: $%.0f%n%n", monto);
        } else if (this.precio < 1) {
            System.out.printf("El monto de la factura es de: $%.1f%n%n", monto);
        } else{
            monto = this.stock * this.precio;
            System.out.printf("El monto de la factura es de: $%.2f%n%n", monto);
        }
        
        return monto;
    }
    
    
}
