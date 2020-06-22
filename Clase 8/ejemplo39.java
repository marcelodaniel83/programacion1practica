/*
Desarrollar un programa que tenga un
método que acepte un número entero y
retorne el cubo del mismo.

*/

import hsa.Console;
class Ejemplo39
{
    static Console c;
    int cubo (int x)
    {
        int z;
        z = x * x * x;
        return z;
    }


    void proceso ()
    {
        int n, resultado;
        c.print ("Ingrese un Numero: ");
        n = c.readInt ();
        resultado = cubo (n);
        c.print ("Su cubo es: " + resultado);
    }


    public static void main (String arg[])
    {
        c = new Console ();
        Ejemplo38 e = new Ejemplo38 ();
        e.proceso ();
    }
}
