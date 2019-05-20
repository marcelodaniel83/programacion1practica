/*Ingresar el nombre de un articulo con su precio. Imprimir el importe a 
pagar. Si recibe un descuento del 12porciento se lo abona de contado.
*/

import hsa.Console;
class EjercicioCuatroClaseUno
 {
static Console c;
public static void main(String arg[])
    {
    c = new Console();
    String articulo;
    float precio;
    double descuento, importeAPagar;
    
    
    articulo = "viaje";
    c.println("Ingrese nombre del articulo: ");
    articulo = c.readString();
    
    c.println("Ingrese precio: ");
    precio = c.readFloat();
    
    descuento = precio*0.12;
    importeAPagar = precio-descuento;
    
    c.println("El importe total con descuento del 12% es de: "+importeAPagar);
    }
}
    
