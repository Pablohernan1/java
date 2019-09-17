
package Ejemplo2;


public class PruebaTiempo2 {
 
   public static void main(String[]args){
       Tiempo2 t1 = new Tiempo2();              //00:00:00
       Tiempo2 t2 = new Tiempo2(2);             //02:00:00
       Tiempo2 t3 = new Tiempo2(21, 34);        //21:34:00
       Tiempo2 t4 = new Tiempo2(12, 25, 42);    //12:25:42
       Tiempo2 t5 = new Tiempo2(t4);            //12:25:42
       
       System.out.println("Se construyo con:");
       mostrarTiempo("t1: todos los argumentos predeterminados", t1);
       mostrarTiempo("t2: Se especifico hora; minuto y segundo predeterminado", t2);
       mostrarTiempo("t3: Se especificaron hora y minuto; Segundo predeterminado", t3);
       mostrarTiempo("t4: Se especificaron hora, minuto y segundo", t4);
       mostrarTiempo("t5: Se especifico el objeto Tiempo2 llamado t4", t5);
       
       try {
           Tiempo2 t6 = new Tiempo2(27,74, 99);
       } catch (Exception e) {
           System.out.printf("%nExcepcion al inicializar t6 %s%n", e.getMessage());
       }
       

   }
   private static void mostrarTiempo(String encabezado, Tiempo2 t){
           System.out.printf("%s%n %s%n %s%n", encabezado, t.aStringUniversal(), t.toString());
       }
    
}
