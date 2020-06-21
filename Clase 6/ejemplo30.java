/*
Desarrollar un programa que solicite una serie de nombres de productos con sus respectivos precios,
y que al finalizar muestre el nombre del producto de menor precio.
La computadora debe preguntar en cada oportunidad, si se siguen ingresando datos o no. 
*/

import hsa.Console;
class Ejemplo30
{
    static Console c;
    public static void main (String arg[])
}
c = new Console ();
int b;
String nombre, nx;
float precio, px;
char opcion;
b = 0;
px = 0;
nx = "";
do
{
    c.clear ();
    c.setCursor (3, 15);
    c.print ("Carga de datos");
    c.setCursor (4, 15);
    c.print ("--------------");
    c.setCursor (6, 10);
    c.print ("Ingrese Nombre de Producto: ");
    nombre = c.readLine ();
    c.setCursor (9, 10);
    c.print ("Ingrese Precio del Producto: ");
    precio = c.readFloat ();
    if (b == 0)
    {
        b = 1;
        nx = nombre;
        px = precio;
    }


    if (precio < px)
    {
        nx = nombre;
        px = precio;
    }


    c.setCursor (15, 10);
    c.print ("Ingresa otro juego de datos (S/N): ");
    opcion = c.readChar ();
}
while (opcion == 'S' || opcion == 's');
c.setCursor (18, 10);
c.print ("El producto de menor precio es: " + nx);
c.setCursor (19, 10);
c.print ("Su precio es de: $ " + px);
}
}
