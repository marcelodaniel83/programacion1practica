/*
Realizar un programa que permita ingresar
un número y muestre su tabla de multiplicar
del 1 al 12.
*/

import hsa.Console;
class Ejemplo38
{
    static Console c;
    int n;
    void ingresoDeDato ()
    {
        c.print ("Ingrese un Numero: ");
        n = c.readInt ();
    }


    void tablaDeMultiplicar ()
    {
        int r;
        c.println ();
        c.println ("Tabla de Multiplicar del numero: " + n);
        c.println ();
        for (int i = 1 ; i <= 12 ; i++)
        {
            r = n * i;
            c.println (n + " x " + i + " = " + r);
        }
    }


    public static void main (String arg[])
    {
        c = new Console ();
        Ejemplo38 e = new Ejemplo38 ();
        e.ingresoDeDato ();
        e.tablaDeMultiplicar ();
    }
}
