
package Arreglos;


public class LibroCalificaciones {
    
    String nombreCurso;
    int largoArreglo;
    int[] calificaciones;
    
    public LibroCalificaciones(String nombreCurso, int[] calificaciones){
        
        this.nombreCurso = nombreCurso;
        this.calificaciones = calificaciones;
        
    }
    
    public int[] obtenerArreglo(){
        return calificaciones;
    }

    public void largoArreglo(int largoArreglo){
        this.largoArreglo = largoArreglo;
    }

    public String imprimirCalificaciones(){

        for (int j = 0; j < largoArreglo; j++) {
        System.out.println(obtenerArreglo()[j]);
        return "_";
        }
        return "_";
    }

}
