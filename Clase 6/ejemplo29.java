/*
Escribir un programa para calcular el promedio de un alumno,
que solicite la carga de sus notas por teclado y que finalice cuando se ingrese el valor 99.
(El valor 99, no debe ser tenido en cuenta para el cálculo)
*/

import hsa.Console;
class Ejemplo29
{
    static Console c;
    public static void main (String arg[]);
}
int n, cantidad, suma;
float promedio;
c = new Console ();
cantidad = 0;
suma = 0;
do
{
    c.print ("Ingrese la nota (99 para terminar): ");
    n = c.readInt ();
    if (n != 99)
    {
        cantidad++;
        suma = suma + n;
    }
}
while (n != 99);
c.println ();
if (cantidad != 0)
{
    promedio = (float) suma / cantidad;
    c.println ("El promedio es: " + promedio);
}
else
    c.println ("No se ingresaron notas.");
}
}
