/*Ingresar la base y la altura de un triangulo, imprimir la superficie del mismo.
Recordar que la superficie del triangulo es  base por altura sobre dos. La formula
seria superficie = b*h/2
*/

import hsa.Console;
class Ejercicio3ClaseUno

{
 static Console c;
 public static void main(String arg[])
    {
    float base, altura, superficie;
    c = new Console();
    
    c.println("Ingresar base: ");
    base = c.readFloat();
    c.println("Ingresar altura: ");
    altura = c.readFloat();
    
    superficie = base*altura/2;
    
    c.println("La superficie del triangulo es: "+superficie);
    }
}    
    

