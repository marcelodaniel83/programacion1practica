/*Realizar el ingreso de dos numeros por teclado e imprimir su suma
y su producto
*/

import hsa.Console;
class EjercicioDosClaseUno

{

static Console c;
public static void main(String arg[])
    {
    c = new Console();
    int numeroUno, numeroDos, suma, producto;
    
   
    
    
    c.println("Ingrese primer numero: ");
    numeroUno = c.readInt();
    
    c.println("Ingrese un segundo numero: ");
    numeroDos = c.readInt();
    
    /*aca habia que declarar tambien el tipo de dato en suma y producto
    */
    
    suma = numeroUno+numeroDos;
    producto = numeroUno*numeroDos;
    
    c.println("La suma de los numeros ingresados es igual a: " +suma);
    c.println("Y el producto de los numeros ingresados es igual a: " +producto);
    
    }
}
    
    
    

